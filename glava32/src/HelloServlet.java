import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloServlet extends GenericServlet {
    @Override

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text.html");
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<b>Hello!</b><br/>");
        pw.println("ServletName "+ getServletName());
        pw.println("ServletInfo "+ getServletInfo());
        pw.println("ServletInfo "+ servletRequest.getServerName());

        pw.println("Test");
        Enumeration e = servletRequest.getParameterNames();
        while (e.hasMoreElements()){
            String pname = (String)e.nextElement();
            pw.print(pname +" = ");
            String pvalue =(String)servletRequest.getParameter(pname);
            pw.println(pvalue);
        }
        pw.close();

    }
}
