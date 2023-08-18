package ATM_JBDC;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public  class ATM_OPERATION extends ATM_Abstract{

    Map<String,Integer>ministmt=new HashMap<>();
    @Override
    public int viewBalance(int a) throws SQLException {

            return ViewBalance.viewbalace(a);
    }

    @Override
    public int creditAmount(int a,int credit) throws SQLException {
        ministmt.put("Amount deposited : ",credit);
       return Deposit.DepositAmount(a,credit);
    }

    @Override
    public int DebitAmount(int a,int debit) throws SQLException{
        ministmt.put("Amount Widthrawn : ",debit);
        return Widthdraw.WidthAmt(a,debit);
    }

    @Override
    public void MiniStmt() throws SQLException {
        for (Map.Entry< String,Integer> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());

        }
    }
}


