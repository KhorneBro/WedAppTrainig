import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class Filter1 implements Filter {
    public Filter1 () {
    }

    public void init (FilterConfig filterConfig) throws ServletException {
        System.out.println ("init method");
    }

    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String servletPath = request.getServletPath ();
        System.out.println ("info " + new Date () + "-ServletPath " + servletPath + "URL= " + request.getRequestURL () );
        HttpSession session = request.getSession (false);
        chain.doFilter (req, resp);

    }

    public void destroy () {
        System.out.println ("destroy method");
    }
}
