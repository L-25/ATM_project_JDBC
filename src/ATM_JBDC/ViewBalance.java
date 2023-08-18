package ATM_JBDC;

import java.sql.*;

public class ViewBalance {

    public static int viewbalace(int id) throws SQLException {
        String query = "select Balance from AccHolder where Acc_no="+id;
        Connection con=DB_Connection.getConnection();
        Statement St=con.createStatement();
        ResultSet rs= St.executeQuery(query);
        rs.next();

        return rs.getInt(1);
    }
}
