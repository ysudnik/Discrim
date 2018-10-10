package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Sudnik on 10.10.2018.
 */
public class Discriminant extends HttpServlet {



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String a = req.getParameter("1");
        String b = req.getParameter("2");
        String c = req.getParameter("3");
        CheckValid.check(req,resp,a,b,c);

    }




}