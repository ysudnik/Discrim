package servlets;

import com.sun.media.sound.SoftLimiter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckValid extends HttpServlet  {

    public static void check(HttpServletRequest req, HttpServletResponse resp,String arg1,String arg2,String arg3) throws ServletException, IOException {
        if (arg1==null||arg2==null||arg3==null){
            DoWrong.doService(req, resp);
        }else if(("qwer\"\"tyuiop[]asdfghjkl;'zxcvbnm,./]/*-+".contains(arg1))||("qwertyuiop[]asdfg\"\"hjkl;'zxcvbnm,./]/*-+".contains(arg2))||("qwertyuiop[]asd\"\"fghjkl;'zxcvbnm,./]/*-+".contains(arg3))) {
            DoWrong.doService(req, resp);
        }else{
            Solution.solut(req,resp);
        }
    }
}
