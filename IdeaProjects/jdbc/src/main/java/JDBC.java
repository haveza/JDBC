import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    public static Connection InitConn(String dbName){
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        Connection con = null;

        try{
            con = DriverManager.getConnection(url,"root","ct,h kvmkhj");
        }catch(Exception e){
            System.out.println(e);
        }

        return con;
    }


}
