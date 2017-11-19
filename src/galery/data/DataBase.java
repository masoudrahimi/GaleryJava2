package galery.data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by masaoud on 03/11/2017.
 */
public class DataBase {

    public static String driver="com.mysql.jdbc.Driver";
    public static String connectionURL="jdbc:mysql://localhost:3306/galery";
    public static String userNameDb="java",passwordDb="1364";
    public static Connection connection;

    public DataBase() throws Exception
   {
      connect();

   }
private void connect() throws  Exception
{
    if(connection != null)
    {
        return;
    }
    try
    {
        Class.forName(driver);
    }
    catch (ClassNotFoundException e)
    {
        //throw  new Exception("Driver Not Found");
        System.out.println("not found");
    }
    connection = DriverManager.getConnection(connectionURL,userNameDb,passwordDb);
    System.out.println("Connected");
}

//    public static void main(String[] args) throws  Exception{
//        DataBase d = new DataBase();
//    }
}
