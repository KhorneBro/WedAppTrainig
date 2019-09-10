import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Session extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType ("text/html");
        PrintWriter printWriter = resp.getWriter ();
        printWriter.print ("<h2> Ur Parametr after pressing the bottom </h2>");
        printWriter.print ("<form action='web3'>");
        printWriter.print ("<input type='submit' value='next'>");
        printWriter.print ("</form>");

        String name1=req.getParameter("name1");
        String name2=req.getParameter("name2");
        String name3=req.getParameter("name3");


        HttpSession session = req.getSession ();
        session.setAttribute("name1", name1);
        session.setAttribute("name2", name2);
        session.setAttribute("name3", name3);



    }
}


