import java.util.InputMismatchException;
import java.util.Scanner;

public class User_Input {
    Create_Account ca = new Create_Account();
    Scanner sc = new Scanner(System.in);
    Verification vf = new Verification();

    public void take_user_input() throws InterruptedException,IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        String firstname = null, lastname = null, acctype = null;
        int balance = 0;

        Thread.sleep(1000);
        firstname = getValidString("Enter your First Name :: ");

        Thread.sleep(1000);
        lastname = getValidString("Enter your Last Name :: ");

        Thread.sleep(1000);
        System.out.print("Choose Account Type Current/Saving :: ");
        acctype = getValid_account_type();

        Thread.sleep(1000);
        balance = getValidInt("Enter your Balance :: ");


        ca.setfirstname(firstname);
        ca.setlastname(lastname);
        ca.setacctype(acctype);
        ca.setbalance(balance);
        ca.setaccnumber();
        ca.setIfsccode();

        ca.setDatabase();

        Thread.sleep(4000);
        ca.displayuserdetails();

    }



    public String getValidString(String prompt) {
        String input = "";
        while (true)
        {
            try {
                System.out.print(prompt);
                input = sc.next();
                validateString(input);
                break;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
        return input;
    }


    public int getValidInt(String prompt)
    {
        int num = 0;
        while (true)
        {
            try {
                System.out.print(prompt);
                num = sc.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.print("Invalid input, please enter a valid number");
                sc.next();
            }
        }
        return num;
    }


    public void validateString(String input)
    {
        if (!input.matches("[a-zA-Z]+"))
        {
            throw new IllegalArgumentException("Input should contain only alphabetic characters.");
        }
    }


    public String getValid_account_type() {
        String input = "";
        while (true) {
            try {
                input = sc.next();
                getValid_account_type_excep(input);
                break;
            } catch (IllegalArgumentException ime)
            {
                System.out.print("Invalid input: " + ime.getMessage() + ":: ");
            }

        }
        return input;
    }




    public void getValid_account_type_excep(String input)
    {
            if (input.equalsIgnoreCase("Saving") || input.equalsIgnoreCase("Current"))
      //  if(input.matches("Saving") || input.matches("Current"))
        {
            return;
        }
        throw new IllegalArgumentException("Enter Valid Input ");
    }



}
