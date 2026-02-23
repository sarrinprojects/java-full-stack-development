package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/'sheet5")
public class Lab5 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public labsheet5() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        out.println("<html><body>");
        if (name != null && !name.isEmpty()) {
            out.println("<h2>Hello, " + name + "!</h2>");
        } else {
            out.println("<h2>Hello, Guest!</h2>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        out.println("<html><body>");
        if (name != null && !name.isEmpty()) {
            out.println("<h2>Hello, " + name + "!</h2>");
        } else {
            out.println("<h2>Hello, Guest!</h2>");
        }
        out.println("</body></html>");
    }
}
