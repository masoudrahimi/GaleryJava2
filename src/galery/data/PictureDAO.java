package galery.data;

import galery.model.Picture;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by masaoud on 17/11/2017.
 */
public class PictureDAO {
    public static ArrayList<Picture> getObjectPicture() throws Exception {
        ArrayList<Picture> pictureList= new ArrayList<Picture>();
        DataBase d = new DataBase();
        Statement stmt = d.connection.createStatement();
        String query;
        query = "SELECT * FROM picture";
        ResultSet resultSet=stmt.executeQuery(query);
        while (resultSet.next()){
            Picture picture = new Picture();
            picture.setId(resultSet.getInt(1));
            picture.setCategoryId(resultSet.getInt(2));
            picture.setAddressPicture(resultSet.getString(3));
            pictureList.add(picture);
        }
        return pictureList;
    }

    public static boolean savePictureToDB(String categoryID, String picAddress) {
        try {
            DataBase d = new DataBase();
            String query;
//            query = "SELECT * FROM category WHERE CategoryTitle=?";
//            PreparedStatement pstmt = d.connection.prepareStatement(query);
//            pstmt.setString(1,categoryName);
//            pstmt.execute();
//            ResultSet resultSet=pstmt.getResultSet();
//            String categoryID=resultSet.getString("Id");
            System.out.println(categoryID);
            query="INSERT INTO picture (CategoryID, AddressPicture) VALUES (?,?)";
            PreparedStatement pstmt=d.connection.prepareStatement(query);
            pstmt.setString(1,categoryID);
            pstmt.setString(2,picAddress);
            return pstmt.execute();

        } catch (Exception e) {
//            e.printStackTrace();
            return false;
        }
    }

    public static boolean DeletePictureToDB(int id) {
        try {
            DataBase d = new DataBase();
            String query;
            query="DELETE FROM picture WHERE Id=?";
            PreparedStatement pstmt=d.connection.prepareStatement(query);
            pstmt.setInt(1,id);
            pstmt.execute();
            return true;
        } catch (Exception e) {
//            e.printStackTrace();
            return false;
        }
    }

}
