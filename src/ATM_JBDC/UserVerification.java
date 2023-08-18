package ATM_JBDC;

import java.sql.*;
import java.util.Scanner;

public class UserVerification {
    int accNo;
    int pin;
    UserVerification(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ATM number : ");
        accNo= sc.nextInt();
        System.out.print("Enter the PIN number : ");
        pin= sc.nextInt();
    }
    public boolean Verification() throws SQLException {
        String query="select *  from AccHolder where Acc_no="+accNo+ " and pin="+pin;
        Connection con=DB_Connection.getConnection();
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery(query);

        while(rs.next()){
            if(accNo==rs.getInt(1) && pin== rs.getInt(2)){
             return  true;
            }
        }
      return false;
    }
}
