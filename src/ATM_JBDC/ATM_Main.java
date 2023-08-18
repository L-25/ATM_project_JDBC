package ATM_JBDC;

import java.sql.SQLException;

import java.util.Scanner;

public class ATM_Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
    UserVerification uv=new UserVerification();
    ATM_OPERATION op=new ATM_OPERATION();
    if(uv.Verification()) {
        while (true) {
            System.out.println("\n1.View Available Balance\n2.Deposit Amount\n3.Widthraw Amount\n4.View Ministatement\n5.Exit\n");
            System.out.print("Enter your choise :");
            int choise= sc.nextInt();
            if(choise==1){
               int a = op.viewBalance(uv.accNo);
                System.out.println("\nBalance amount :"+a+".0 Rs");
            }
            else if (choise==2) {
                System.out.print("Enter Amount to Deposit : ");
                int deposit= sc.nextInt();
                System.out.println(deposit+".0 Rs Successfully Depositted !!!\n ");
                op.creditAmount(uv.accNo, deposit);
                System.out.println("Available Balance : "+ViewBalance.viewbalace(uv.accNo));
            }
            else if (choise==3) {
                System.out.print("Enter Amount to Widthraw : ");
                int  Widthdraw= sc.nextInt();

                if(Widthdraw<=ViewBalance.viewbalace(uv.accNo)) {
                    System.out.println(Widthdraw + ".0 Rs Successfully Widthdraw !!!\n");
                    op.DebitAmount(uv.accNo,Widthdraw);
                    System.out.println("Available Balance : "+ViewBalance.viewbalace(uv.accNo));
                }
                else{
                    System.out.println("Insufficient Balance");
                }
            }
            else if (choise==4) {
                  op.MiniStmt();

            } else if (choise==5){
                System.out.println("Please collect your card.Thankyou for visiting ATM!!!!!!!");
                System.exit(0);
            }
            else{
                System.out.println("Please enter the choise 1-5");
            }
        }
    }
    else{
        System.out.println("\nIncorrect pin or AccNo. Please Enter the correct Pin or AccNo");
        }

    }
}
