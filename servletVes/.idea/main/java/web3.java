import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class web3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();

        Object n1 = session.getAttribute ("name1");

        if (n1 == "1"){
            RequestDispatcher rd = req.getRequestDispatcher ("/Start.jsp");
            rd.forward (req, resp);
        }


        String title = "Registration";
        String docType = "<!DOCTYPE html>";

        writer.println("<html>"+
               "<head><title>" + title + "</title></head>\n"+
                "<body><h3> Hello </h3>"
                + "<p>"+ session.getAttribute ("name2") + "</p>"
                + "<p>"+ session.getAttribute ("name1") + "</p>"
                + "<p>"+ session.getAttribute ("name3") + "</p>"
                + "</body>" +
                "</html>");
   }
    @Override
    public void destroy() {

    }
}
