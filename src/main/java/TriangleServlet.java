import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class TriangleServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int c = Integer.parseInt(request.getParameter("c"));

        TriangleType type = Triangle.classify(a, b, c);

        String message = String.valueOf(type.toString());
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This triangle is " + message + "</h1>");
        out.flush();
        out.close();
    }

    public void destroy() {
    }
}