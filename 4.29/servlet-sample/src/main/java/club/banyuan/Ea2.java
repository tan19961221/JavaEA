package club.banyuan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/ea2")
public class Ea2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("application/pdf");
        ServletContext ctx=getServletContext();
        InputStream is=ctx.getResourceAsStream("/1-Servlet简介.pdf");
        int read=0;
        byte[] bytes=new byte[1024];
        OutputStream os=resp.getOutputStream();
        while ((read=is.read(bytes))!=-1){
            os.write(bytes,0,read);
        }
        os.flush();
        os.close();
    }
}