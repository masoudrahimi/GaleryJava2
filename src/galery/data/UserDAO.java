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

    public int save(String name,String family,String userName,String password,int state,int question1,String answer1,int question2,String answer2) throws Exception
    {

        DataBase dataBase = new DataBase();
        Connection connection =dataBase.connection;
        String sql = "SELECT * FROM user WHERE UserName=?";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.execute();
            ResultSet result = preparedStatement.getResultSet();
            //dataBase.connection.close();
            if(result.next())
            {
                return 1;//isExist user
            }
            else
            {
                sql = "INSERT INTO user (Id,Name,Family,UserName,Password,StatId,Question1Id,Answer1,Question2Id,Answer2) VALUES(?,?,?,?,?,?,?,?,?,?)";
                try
                {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1,0);
                    preparedStatement.setString(2,name);
                    preparedStatement.setString(3,family);
                    preparedStatement.setString(4,userName);
                    preparedStatement.setString(5,password);
                    preparedStatement.setInt(6,state);
                    preparedStatement.setInt(7,question1);
                    preparedStatement.setString(8,answer1);
                    preparedStatement.setInt(9,question2);
                    preparedStatement.setString(10,answer2);
                    preparedStatement.executeUpdate();
                    return 2;//success Insert
                }
                catch (SQLException e)
                {
                    return 3;//Insert fail
                }
            }
        }
        catch (SQLException e)
        {
            //System.out.println(e.getMessage());
            return 4;// error connection
        }
    }

    public int changePassword(String userName,String password,int question1,String answer1,int question2,String answer2) throws Exception
    {

        DataBase dataBase = new DataBase();
        Connection connection =dataBase.connection;
        String sql = "SELECT * FROM user WHERE UserName=? AND Question1Id=?  AND Answer1=? AND Question2Id=? AND Answer2=?  ";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setInt(2,question1);
            preparedStatement.setString(3, answer1);
            preparedStatement.setInt(4,question2);
            preparedStatement.setString(5, answer2);
            preparedStatement.execute();
            ResultSet result = preparedStatement.getResultSet();
            //dataBase.connection.close();
            if(result.next())
            {
                sql = "UPDATE user SET Password=? WHERE UserName=? AND Question1Id=?  AND Answer1=? AND Question2Id=? AND Answer2=? ";
                try
                {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1,password);
                    preparedStatement.setString(2,userName);
                    preparedStatement.setInt(3,question1);
                    preparedStatement.setString(4,answer1);
                    preparedStatement.setInt(5,question2);
                    preparedStatement.setString(6,answer2);
                    preparedStatement.executeUpdate();
                    return 2;//success UPDATE
                }
                catch (SQLException e)
                {
                    return 3;//error connection
                }
            }
            else
            {
                return 1; //not exist user
            }
        }
        catch (SQLException e)
        {
            //System.out.println(e.getMessage());
            return 3;// error connection
        }
    }
}
