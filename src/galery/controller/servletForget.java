package galery.controller;

import galery.data.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by masaoud on 20/11/2017.
 */
public class servletForget extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();
        try
        {
            int flag=userDAO.changePassword(req.getParameter("username"),req.getParameter("npassword"),Integer.parseInt(req.getParameter("questions1")),
                    req.getParameter("answer1"),Integer.parseInt(req.getParameter("questions2")),req.getParameter("answer2"));
            String message="";
            if (flag==2)
            {
                message="Change password has been successfully completed";
                req.setAttribute("alertMsg",message);
                RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
                rd.include(req, resp);
                //res.sendRedirect("index.jsp");
            }
            else if(flag==1)
            {
                message="Fail Update";
                req.setAttribute("alertMsg",message);
                RequestDispatcher rd=req.getRequestDispatcher("/forget.jsp");
                rd.include(req, resp);
                //res.sendRedirect("register.jsp");
            }
            else
            {
                message="Fail connect to DataBase";
                req.setAttribute("alertMsg",message);
                RequestDispatcher rd=req.getRequestDispatcher("/forget.jsp");
                rd.include(req, resp);
                //res.sendRedirect("register.jsp");
            }
        }
        catch (Exception e)
        {

        }
    }
}
