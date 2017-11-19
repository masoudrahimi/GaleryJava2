package galery.controller;

import galery.data.UserDAO;
import galery.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by masaoud on 17/11/2017.
 */
public class servletLogin extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();
        try
        {
            if(userDAO.isExist( req.getParameter("username"),req.getParameter("password") ))
            {
                HttpSession session = req.getSession(true);
                User user = userDAO.getUser(req.getParameter("username"),req.getParameter("password"));
                session.setAttribute("user",user);
                if(user.getStatId()==1)
                    res.sendRedirect("admin/regimage.jsp");//req.getRequestDispatcher("admin/regimage.jsp").forward(req,res);
                else if (user.getStatId()==2)
                    res.sendRedirect("user/list.jsp");//req.getRequestDispatcher("user/list.jsp").forward(req,res);
            }
            else
            {
                res.sendRedirect("index.jsp");
            }
        }
        catch (Exception e)
        {
            res.sendRedirect("index.jsp");
            //System.out.println("error");
        }

    }
}
