package galery.controller;

import galery.data.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by masaoud on 19/11/2017.
 */
public class servletRegister extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        UserDAO userDAO = new UserDAO();
        try
        {
            int flag=userDAO.save(req.getParameter("name"),req.getParameter("lastname"),req.getParameter("username"),
                    req.getParameter("pass"),Integer.parseInt(req.getParameter("state")),Integer.parseInt(req.getParameter("questions1")),
                    req.getParameter("answer1"),Integer.parseInt(req.getParameter("questions2")),req.getParameter("answer2"));
            String message="";
            if (flag==2)
            {
                message="registration has been successfully completed";
                req.setAttribute("alertMsg",message);
                RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
                rd.include(req, res);
                //res.sendRedirect("index.jsp");
            }
            else if(flag==1)
            {
                message="Username is duplicate";
                req.setAttribute("alertMsg",message);
                RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
                rd.include(req, res);
                //res.sendRedirect("register.jsp");
            }
            else
            {
                message="Fail connect to DataBase";
                req.setAttribute("alertMsg",message);
                RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
                rd.include(req, res);
                //res.sendRedirect("register.jsp");
            }
        }
        catch (Exception e)
        {

            String message="Fail connect to DataBase";
            req.setAttribute("alertMsg",message);
            RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
            rd.include(req, res);
            //System.out.println("error");
        }
    }
}
