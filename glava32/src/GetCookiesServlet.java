import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<b>");
        for (int i = 0; i <cookies.length ; i++) {
            String name = cookies[i].getName();
            String value = cookies[i].getValue();
            pw.println("name = "+name+"; value = "+value);
        }
        pw.close();
    }
}
