import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PersonInformation extends HttpServlet implements Servlet {
//    @Override
//    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String firstname = req.getParameter("firstname");
//        String lastname = req.getParameter("lastname");
//        String password = req.getParameter("password");
//        String sex = req.getParameter("sex");
//        String press = req.getParameter("press");
//        resp.setContentType("text/html");
//        PrintWriter pw = resp.getWriter();
//        pw.println("<html> " + "<body> "
//                + "<br>Ppp:doPost:firstname=" + firstname
//                + "<br>Ppp:doPost:lastname= " + lastname
//                + "<br>Ppp:doPost:password= " + password
//                + "<br>Ppp:doPost:sex= " + sex
//                + "<br>Ppp:doPost:press= " + press
//                + "</body>" + "</html>");
//        pw.close();
//    }
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String press = req.getParameter("press");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<html> " + "<body> "
                + "<br>Ppp:doPost:firstname=" + firstname
                + "<br>Ppp:doPost:lastname= " + lastname
                + "<br>Ppp:doPost:password= " + password
                + "<br>Ppp:doPost:sex= " + sex
                + "<br>Ppp:doPost:press= " + press
                + "</body>" + "</html>");
        pw.close();
    }
}
