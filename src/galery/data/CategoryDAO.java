package galery.data;

import galery.model.Category;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by masaoud on 17/11/2017.
 */
public class CategoryDAO {
    public static Boolean createCategory(String catName) {
        try {
            DataBase d = new DataBase();
            Statement stmt = d.connection.createStatement();
            String query;
            query = "INSERT INTO Category (CategoryTitle, AddressPicture) VALUES (" + catName + ", AddressPicture)";
            stmt.executeQuery(query);
            return true;
        } catch (Exception e) {
            System.out.println("Error In connection");
            return false;
        }

    }

    public static ArrayList<String> getCategories() throws Exception {
        ArrayList<String> categoryList= new ArrayList<String>();
        DataBase d = new DataBase();
        Statement stmt = d.connection.createStatement();
        String query;
        query = "SELECT * FROM Category";
        ResultSet resultSet=stmt.executeQuery(query);
        while (resultSet.next()){
            categoryList.add(resultSet.getString("CategoryTitle"));
        }
            return categoryList;
    }


}
