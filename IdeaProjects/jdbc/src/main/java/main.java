import java.sql.*;
import java.util.Enumeration;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        if(null == (con = JDBC.InitConn("demo"))){ return;}

        Scanner scan = new Scanner(System.in);
        String param1 = scan.next();
        double param2 = scan.nextDouble();

        System.out.println("before\n");
        JDBC.ShowTable(param1);

        JDBC.CallINSP(param1, param2);

        System.out.println("after\n");
        JDBC.ShowTable(param1);


    }



}


