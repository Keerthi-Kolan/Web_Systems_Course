import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Indexed extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        // Get PrintWriter object
        PrintWriter out = response.getWriter();

        // Get parameters from the request
        String eventname = request.getParameter("event");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String location = request.getParameter("location");

        // Write HTML content
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("    <style>");
        out.println("        /* Add your CSS styles here */");
        out.println("        .container {");
        out.println("            display: flex;");
        out.println("        }");
        out.println("        .left {");
        out.println("            flex: 1;");
        out.println("        }");
        out.println("        .right {");
        out.println("            flex: 1;");
        out.println("        }");
        out.println("        .button {");
        out.println("            background-color: lightgray;");
        out.println("            color: black;");
        out.println("            padding: 15px 20px;");
        out.println("            text-align: center;");
        out.println("            text-decoration: none;");
        out.println("            display: inline-block;");
        out.println("            cursor: pointer;");
        out.println("            border: none;");
        out.println("        }");
        out.println("        .button.agree {");
        out.println("            background-color: green;");
        out.println("        }");
        out.println("        .button.disagree {");
        out.println("            background-color: red;");
        out.println("        }");
        out.println("        .button.submit {");
        out.println("            background-color: grey;");
        out.println("        }");
        out.println("        /* Add more styles as needed */");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <form id=\"invitationForm\" action=\"lastpage\" method=\"post\">");
        out.println("        <input type=\"hidden\" id=\"attendCount\" name=\"attendCount\" value=\"0\">");
        out.println("        <input type=\"hidden\" id=\"nonAttendCount\" name=\"nonAttendCount\" value=\"0\">");
        out.println("        <div class=\"container\">");
        out.println("            <div class=\"left\">");
        out.println("                <video width=\"600\" height=\"480\" controls autoplay loop muted>");
        out.println("                    <source src=\"Party.mp4\" type=\"video/mp4\">");
        out.println("                    Your browser does not support the video tag.");
        out.println("                </video>");
        out.println("            </div>");
        out.println("            <div class=\"right\">");
        out.println("                <br><br>");
        out.println("                <p>Event Name: " + eventname + "</p>"); // Display event details
        out.println("                <p>Date: " + date + "</p>");
        out.println("                <p>Time: " + time + "</p>");
        out.println("                <p>Location: " + location + "</p>");
        out.println("                <button type=\"button\" id=\"agree\" class=\"button agree\">Attend</button>");
        out.println("                <button type=\"button\" id=\"disagree\" class=\"button disagree\">Not Attend</button><br><br>");
        out.println("                <p id=\"attendCounter\" name=\"attend\">Number of attendees: 0</p>");
        out.println("                <p id=\"nonAttendCounter\" name=\"notattend\">Number of Non-attendees: 0</p>");
        out.println("                <button type=\"submit\" class=\"button submit\">Submit</button><br><br>");
        out.println("                <img id=\"myImage\" src=\"white.png\" style=\"width:100px\">");
        out.println("            </div>");
        out.println("        </div>");
        out.println("</form>");

        // JavaScript code
        out.println("<script>");
        out.println("    document.addEventListener('DOMContentLoaded', function () {");
        out.println("        var attendButton = document.getElementById('agree');");
        out.println("        var nonAttendButton = document.getElementById('disagree');");
        out.println("        var attendCounter = 0;");
        out.println("        var nonAttendCounter = 0;");
        out.println("        attendButton.addEventListener('click', function () {");
        out.println("            alert('You are attending the event!');");
        out.println("            attendCounter++;");
        out.println("            document.getElementById('attendCounter').innerText = 'Attend Counter: ' + attendCounter;");
        out.println("            document.getElementById('attendCount').value = attendCounter;");
        out.println("        });");
        out.println("        nonAttendButton.addEventListener('click', function () {");
        out.println("            alert('You are not attending the event!');");
        out.println("            nonAttendCounter++;");
        out.println("            document.getElementById('nonAttendCounter').innerText = 'Non-Attend Counter: ' + nonAttendCounter;");
        out.println("            document.getElementById('nonAttendCount').value = nonAttendCounter;");
        out.println("        });");
        out.println("    });");
        out.println("</script>");

        out.println("</body>");
        out.println("</html>");
    }
}
