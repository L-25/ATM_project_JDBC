package ATM_JBDC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

public class Deposit {
    public static int DepositAmount(int a, int credit) throws SQLException {

        String query ="update AccHolder set Balance=? where Acc_no=?";
        int balance= ViewBalance.viewbalace(a);
        Connection con=DB_Connection.getConnection();
        PreparedStatement prs= con.prepareStatement(query);
        balance+=credit;
        prs.setInt(1,  balance);
        prs.setInt(2,a);
        prs.executeUpdate();

        return  balance;
    }
}
