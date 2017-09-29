import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        HttpSession hs = request.getSession(true);
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("<b>");
        Date date =(Date)hs.getAttribute("date");
                if(date !=null){
                    pw.print("Last access: "+date+"<br>");
                }
                date = new Date();
                hs.setAttribute("date",date);
                pw.println("Current date: "+date);
    }
}
