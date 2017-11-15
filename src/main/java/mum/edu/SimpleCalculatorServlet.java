package mum.edu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SimpleCalculatorServlet")
public class SimpleCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String param1 = request.getParameter("num1");
            String param2 = request.getParameter("num2");
            String param3 = request.getParameter("num3");
            String param4 = request.getParameter("num4");

            PrintWriter writer = response.getWriter();
            writer.print("<html>");
            writer.print("<head>");
            writer.print("<title>Simple Calculator</title>");
            writer.print("<link href='SimpleCalculator.css' rel='stylesheet' type='text/css'>");
            writer.print("</head>");
            writer.print("<body>");
            writer.print("<input class='number' type='text' value='" +
                    ((param1.length() != 0) ? Integer.parseInt(param1) : "") + "'>");
            writer.print("&nbsp;+&nbsp;");
            writer.print("<input class='number' type='text' value='" +
                    ((param2.length() != 0) ? Integer.parseInt(param2) : "") + "'>");
            writer.print("&nbsp;=&nbsp;");
            writer.print("<input class='number' type='text' disabled value='" +
                    ((param1.length() != 0 && param2.length() != 0) ? (Integer.parseInt(param1)+Integer.parseInt(param2)) : "")
                    + "'>");
            writer.print("<br>");
            writer.print("<input class='number' type='text' value='" +
                    ((param3.length() != 0) ? Integer.parseInt(param3) : "") + "'>");
            writer.print("&nbsp;*&nbsp;");
            writer.print("<input class='number' type='text' value='" +
                    ((param4.length() != 0) ? Integer.parseInt(param4) : "") + "'>");
            writer.print("&nbsp;=&nbsp;");
            writer.print("<input class='number' type='text' disabled value='" +
                    ((param3.length() != 0 && param4.length() != 0) ? Integer.parseInt(param3)*Integer.parseInt(param4) : "")
                    + "'>");
            writer.print("</body>");
            writer.print("</html>");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            PrintWriter writer = response.getWriter();
            writer.print("<html>");
            writer.print("<head>");
            writer.print("<title>Simple Calculator</title>");
            writer.print("</head>");
            writer.print("<body>");
            writer.print("<h1>Invalid Number Format</h1>");
            writer.print("</body>");
            writer.print("</html>");

        }
    }
}
