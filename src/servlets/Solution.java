package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Solution extends HttpServlet {
    public static void solut (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("1");
        String b = req.getParameter("2");
        String c = req.getParameter("3");
        int A =Integer.parseInt(a);
        int B =Integer.parseInt(b);
        int C =Integer.parseInt(c);

        int D = B*B-4*A*C;
        if (D>=0){
            double x1= ((-B)+(Math.sqrt(D)))/(2*A);
            double x2= ((-B)-(Math.sqrt(D)))/(2*A);
            String x3 = String.valueOf(x1);
            String x4 = String.valueOf(x2);
            req.getServletContext().setAttribute("a", a);
            req.getServletContext().setAttribute("b", b);
            req.getServletContext().setAttribute("c", c);
            req.getServletContext().setAttribute("x3", x3);
            req.getServletContext().setAttribute("x4", x4);
            req.getRequestDispatcher("/result.jsp").forward(req, resp);
        }else{
            Discriminant.doService(req,resp);
        }
    }
}
