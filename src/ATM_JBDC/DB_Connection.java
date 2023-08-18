package ATM_JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    private static final String url="jdbc:mysql://localhost:3306/ATM";
    private static final String user="root";
    private static final String password="2003";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
