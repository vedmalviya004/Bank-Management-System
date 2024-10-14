import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank_Service {

    Verification vf = new Verification();
    User_Input un = new User_Input();
    Scanner sc = new Scanner(System.in);
    Database db = new Database();
    Create_Account ca = new Create_Account();

   static Display_Details ddobject;

    public void createAccount() throws InterruptedException,IllegalArgumentException {

        Thread.sleep(3000);
        un.take_user_input();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }



    public void displayAccount()
    {
        System.out.println("****Display Details****");

          ddobject= vf.verifyuser();

          if(null == ddobject)
          {
              return;
          }
          ddobject.displayInfo();


        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public void depositAmount()
    {


        if((ddobject = vf.verifyuser()) != null)
        {
            System.out.print("Enter Amount for Deposit  :: ");
            int depositamount = sc.nextInt();
            ca.deposit(depositamount,ddobject);
//            depositAmountinvariable(ddobject,depositamount);
            System.out.println("Deposit Successful!!");
        }
        else
            return;
    }

    public void withdrawAmount(){
        System.out.print("Enter Amount for Withdraw :: ");
        int witdrawamount = sc.nextInt();
        ca.withdraw(witdrawamount);
        System.out.println("Withdraw Successful!!");
        ca.displayuserdetails();
    }

    public void closeAccount(){
        System.out.println("\n\nEnter the Account Number");
        long acountnumber = sc.nextLong();

        if(db.checkaccnumber(acountnumber))
        {
            System.out.println("\nAccount Number Matched!!\n\n");
            db.deleteholderdetails(acountnumber);
            System.out.println("Account Delete Successful!!\n\n");
        }
        else
            System.out.println("\nAccount Not Found!!");

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }


}

