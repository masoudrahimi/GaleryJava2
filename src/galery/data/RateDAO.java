package galery.data;

import java.sql.*;

/**
 * Created by masaoud on 17/11/2017.
 */
public class RateDAO {
    public static boolean ratePicture(int userID, int pictureID, int rate) throws Exception {
        DataBase d = new DataBase();
        String query = "INSERT INTO rate (UserID, PictureID, rate) VALUES (?,?,?)";
        try {
            PreparedStatement pstmt = d.connection.prepareStatement(query);
            pstmt.setString(1, String.valueOf(userID));
            pstmt.setString(2, String.valueOf(pictureID));
            pstmt.setString(3, String.valueOf(rate));
            pstmt.execute();
            ResultSet result = pstmt.getResultSet();
            if (result.next()) {
                return true;
            } else
                return (false);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static float getPictureRate(int pictureID) throws Exception {
        float averageRate = 0;
        int count = 0;
        int countComp=1;
        DataBase d = new DataBase();
        String query;
        query = "SELECT * FROM rate WHERE PictureID=?";
        PreparedStatement pstmt = d.connection.prepareStatement(query);
        pstmt.setString(1, String.valueOf(pictureID));
        pstmt.execute();
        ResultSet resultSet = pstmt.getResultSet();
        while (resultSet.next()) {
            averageRate += resultSet.getInt("rate");
            count++;
            countComp=0;
        }
        averageRate = averageRate / (count+countComp);
        return averageRate;
    }
}
