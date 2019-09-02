import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class DateJSP extends HttpServlet implements Servlet {
    public DateJSP(){
        super();
    }

    @Override
    public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String hour = req.getParameter ("hour");
        Integer h;
        try {
            h=new Integer (hour);
        } catch (NumberFormatException e){
            h=-1;
        }
        res.setContentType ("text/html");
        PrintWriter pw = res.getWriter ();
        String rc = "Good";
        if ((h>0) && (h<=5))
            rc+="night";
        else if ((h>5) && (h<=12))
            rc+="morning";
        else if ((h>12) && (h<=17))
            rc+="afternoon";
        else
            rc="evening";
        pw.println (rc);
        pw.flush ();
    }
}
