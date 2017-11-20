package galery.data;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Uploader extends javax.servlet.http.HttpServlet {
    private final static String UPLOAD_DIRECTORY = "C:/Users/masaoud/Desktop/Amoozesh2/SCI/java_kahkeshan/Project_Galery/GaleryJava2git/GaleryJava2/out/artifacts/GaleryJava2_war_exploded/upload";
    public String mess;

    public String getMess() {
        return this.mess;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //process only if its multipart content
        System.out.println("doPost outer part uploader");
        if (ServletFileUpload.isMultipartContent(request)) {
            System.out.println("doPost Inner part");
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);
                String name = "";
                String fieldvalue = "";
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        name = new File(item.getName()).getName();
                        //////////////////////////////////////////////////
                        System.out.println("name= " + name);
                        String address = UPLOAD_DIRECTORY + File.separator + name;
//                        request.setAttribute("address", address);
//                        request.setAttribute("fileName",name);
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
                    } else if (item.isFormField()){
//                        String fieldx=item.getName();
                        fieldvalue=item.getString();
//                        System.out.println("fieled Value= " + fieldvalue);
                    }


                }
                System.out.println("\n===============\n\n field: " + fieldvalue + " name: " + name);
                PictureDAO.savePictureToDB(fieldvalue, name);
                //File uploaded successfully
                this.mess = "File Uploaded Successfully";
                request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
                this.mess = "File Upload Failed due to " + ex;
                request.setAttribute("message", "File Upload Failed due to " + ex);
            }
        } else {
            this.mess = "Sorry this Servlet only handles file upload request";
            request.setAttribute("message", "Sorry this Servlet only handles file upload request");
        }
    }

}
