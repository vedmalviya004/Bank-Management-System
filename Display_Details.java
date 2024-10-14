public class Display_Details
{

    public Display_Details()
    {

    }
    String holdername;
    String accounttype;
    int accountbalance;
    long accountnumber;
    String ifsccode;


    public  Display_Details( String holdername, String accounttype, int accountbalance, long accountnumber, String ifsccode)
    {
        this.holdername = holdername;
        this.accounttype = accounttype;
        this.accountbalance = accountbalance;
        this.accountnumber = accountnumber;
        this.ifsccode = ifsccode;
    }



    public void displayInfo() {
        System.out.println("\n\nHolder Name is :: " + holdername);
        System.out.println("Holder Account Type is :: " + accounttype);
        System.out.println("Holder Available Balance is :: " + accountbalance);
        System.out.println("Holder Account Number is :: " + accountnumber);
        System.out.println("Holder IFSC Code is :: " + ifsccode + "\n\n");
    }





}
//