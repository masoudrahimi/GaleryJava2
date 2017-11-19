package galery.data;

import galery.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by masaoud on 17/11/2017.
 */
public class UserDAO {
    public UserDAO()
    {}
    public boolean isExist(String userName,String password) throws Exception
    {

        DataBase dataBase = new DataBase();
        Connection connection =dataBase.connection;
        String sql = "SELECT * FROM user WHERE UserName=? AND  Password=?";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2,password);
            preparedStatement.execute();
            ResultSet result = preparedStatement.getResultSet();
            //dataBase.connection.close();
            if(result.next())
            {
                return true;
            }
            else
                return (false);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public User getUser(String userName,String password) throws Exception
    {

        DataBase dataBase = new DataBase();
        Connection connection =dataBase.connection;
        User user;
        String sql = "SELECT * FROM user WHERE UserName=? AND  Password=?";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2,password);
            preparedStatement.execute();
            ResultSet result = preparedStatement.getResultSet();
            //dataBase.connection.close();
            if(result.next())
            {
                int id = result.getInt(1);
                String name = result.getString(2);
                String family = result.getString(3);
                String user_Name = result.getString(4);
                String pass = result.getString(5);
                int statId = result.getInt(6);
                int question1Id = result.getInt(7);
                String answer1 = result.getString(8);
                int question2Id = result.getInt(9);
                String answer2 = result.getString(10);
                user = new User(id,name,family,user_Name,pass,statId,question1Id,question2Id,answer1,answer2);
                return user;
            }
            else
                return null;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
