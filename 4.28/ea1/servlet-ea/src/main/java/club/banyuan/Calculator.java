package club.banyuan;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer  a=Integer.valueOf(req.getParameter("a"));
        Integer  b=Integer.valueOf(req.getParameter("b"));
        Integer  c=a+b;
        resp.getWriter().append(c.toString());
    }
}