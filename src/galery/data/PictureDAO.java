package galery.data;

import galery.model.Picture;

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

}
