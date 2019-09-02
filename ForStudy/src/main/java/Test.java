import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends HttpServlet implements Servlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parm;
        parm="rfee";
        System.out.println ("blabla=" + parm);
        resp.setContentType ("text/html");
        PrintWriter pw = resp.getWriter ();
        pw.println ("<html>"
        +"<body>"
        +"<br>Bla=" + parm
        +"</body>"
        +"</html>");
        pw.close ();
    }
}
