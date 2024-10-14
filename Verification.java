import java.util.Scanner;

public class Verification {

    Database db = new Database();

    Scanner sc = new Scanner(System.in);
    public Display_Details verifyuser()
    {
        System.out.println("\n\nEnter the Account Number");
        long acountnumber = sc.nextLong();
//        System.out.println("Account is " + acountnumber);

        if (db.checkaccnumber(acountnumber))
        {
            System.out.println("\nAccount Number Matched!!\n\n");
            return db.displayholderdetails();

        }
        System.out.println("\nAccount Not Found!!");
        return null;
    }
}

