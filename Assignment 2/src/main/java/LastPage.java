import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LastPage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String attend = request.getParameter("attendCount");
        String nonattend=request.getParameter("nonAttendCount");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Attendee Count</title>");
        out.println("</head>");
        out.println("<body>");

        // Left division with text content
        out.println("<div style=\"float: left; width: 50%;\">");
        out.println("<br><br><h2>Number of attendees: " + attend + "</h2>");
        out.println("<br><br><h2>Number of Non-attendees:"+nonattend+"</h2>");
        out.println("</div>");

        // Right division with an image
        out.println("<div style=\"float: left; width: 50%;\">");
        out.println("<img src=\"Thankyou.png\" alt=\"Your Image\">");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
