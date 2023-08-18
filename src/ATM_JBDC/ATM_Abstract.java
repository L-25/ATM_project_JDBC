package ATM_JBDC;

import java.sql.SQLException;


abstract class ATM_Abstract {

    public abstract int viewBalance(int a) throws SQLException;

    public abstract int  creditAmount(int a, int credit) throws SQLException;


    public abstract int DebitAmount(int a, int debit) throws SQLException;

    public abstract  void MiniStmt() throws SQLException;

}
