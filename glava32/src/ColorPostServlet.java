import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ColorPostServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        String color = req.getParameter("color");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<b>The selected color is: ");
        pw.println(color);
        pw.close();
    }
}
