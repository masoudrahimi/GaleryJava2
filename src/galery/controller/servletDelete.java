package galery.controller;

import galery.data.PictureDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by masaoud on 20/11/2017.
 */
public class servletDelete extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PictureDAO pictureDAO = new PictureDAO();
        try
        {
            boolean flag=pictureDAO.DeletePictureToDB(Integer.parseInt(req.getParameter("id")));
            if (flag)
            {
                resp.sendRedirect("regimage.jsp");
            }
            else
            {
                resp.sendRedirect("../index.jsp");
            }

        }
        catch (Exception e)
        {

        }
    }

}
