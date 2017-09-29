import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddCookieServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException,IOException{
        String data = request.getParameter("data");
        Cookie cookie = new Cookie("MyCookie",data);
        response.addCookie(cookie);
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<b>MyCookie has been set to");
        pw.println(data);
        pw.close();
    }
}
