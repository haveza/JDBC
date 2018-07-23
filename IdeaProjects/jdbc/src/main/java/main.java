import java.sql.*;
import java.util.Enumeration;
public class main {

    public static void main(String[] args) throws SQLException {
        Connection con = null;

        if(null == (con = JDBC.InitConn("db"))){ return;}

        // Create Query
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from `table`");

        while(rs.next())
            System.out.println(rs.getInt(1));

        // Insert Data
        stmt.executeUpdate("INSERT INTO `table`()  VALUES()");

        // Delete Rows
         int num_of_rows = stmt.executeUpdate("DELETE FROM `table` WHERE id = 9");

        System.out.println("rows deleted : " + num_of_rows);

        // Prepared Statements
        // Create Query

        PreparedStatement prpStmt = con.prepareStatement("SELECT * FROM `table` WHERE id%? = 0 AND id > ?");


        // Set Params
        prpStmt.setInt(1, 3);
        prpStmt.setInt(2, 7);

        rs = prpStmt.executeQuery();

        while(rs.next())
            System.out.println(rs.getInt(1));

        // Delete Rows
        prpStmt = con.prepareStatement("DELETE FROM `table` WHERE id = ?");

        prpStmt.setInt(1, 5);

        int num_of_rows2 = prpStmt.executeUpdate();
        System.out.println("rows deleted : " + num_of_rows2);


    }



}


