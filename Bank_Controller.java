import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank_Controller extends Bank_Service{
    public static void main(String[] args) throws InterruptedException,IllegalArgumentException{
        System.out.println("############### SBI Bank Management System ################\n\n");

        Scanner sc = new Scanner(System.in);
        Bank_Service bank_service_obj = new Bank_Service();

        Thread.sleep(1000);
        System.out.println("****Select the Operation!****\n");

        int exitvar = 0;
        int choicevar;

        while(exitvar!=-1)
        {
            System.out.println("1.Create a Bank Account");
            System.out.println("2.Display the Account Details");
            System.out.println("3.Deposit the amount");
            System.out.println("4.Withdraw the amount");
            System.out.println("5.Close the Account");
            System.out.println("6.Exit\n");

            System.out.print("Enter Your Choice :: ");
            try
            {
                 choicevar = sc.nextInt();
            }
            catch (InputMismatchException ip)
            {
                sc.next();
                System.out.print("Invalid input, Please Reenter the input :: ");
                 choicevar = sc.nextInt();
            }



        switch (choicevar) {
            case 1:
                bank_service_obj.createAccount();
                break;
            case 2:
                bank_service_obj.displayAccount();
                break;
            case 3:
                bank_service_obj.depositAmount();
                break;
            case 4:
                bank_service_obj.withdrawAmount();
                break;
            case 5:
                bank_service_obj.closeAccount();
                break;
            case 6:
                return;

        }
        }
    }
}

