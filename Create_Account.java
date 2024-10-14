import java.util.Random;

public class Create_Account {


    Database db = new Database();
    Random rand = new Random();
    private int balance =0;
    private String firstname ;
    private String lastname ;

    private String acctype;

    private long accnumber;

    private String ifsccode;


    public void setaccnumber()
    {
       long accnumber  = rand.nextLong((99999999999L+1) - 10000000000L) + 10000000000L;
       this.accnumber = accnumber;
       db.set_accnum_list(accnumber);
//        System.out.println("set_accnum_list"+ accnumber);
    }

    public void setIfsccode()
    {
         long setifsccode =   rand.nextLong((9999999L+1) - 1000000L) + 1000000L;
         this.ifsccode = "SBIN"+setifsccode;
    }

    public void setfirstname(String firstnamename)
    {
        this.firstname = firstnamename;
    }

    public void setlastname(String lastnamename)
    {
        this.lastname = lastnamename;
    }

    public void setacctype(String acctype)
    {
        this.acctype = acctype;
    }

    public void setbalance(int balance)
    {
        this.balance = balance;
    }


    public String getFirstnamename()
    {
        return firstname;
    }

    public String getLastnamename()
    {
        return lastname;
    }

    public String getAcctype()
    {
        return acctype;
    }

    public int getBalance()
    {
        return balance;
    }


    public long getaccountnumber()
    {
        return accnumber;
    }


    public String getIfsccode()
    {
        return ifsccode;
    }


    public void setDatabase()
    {
        Display_Details dd = new Display_Details(firstname+" "+lastname,acctype,balance,accnumber,ifsccode);
        db.getobject(dd);
    }


    public void displayuserdetails(){
        System.out.println("\n\nHolder Name is              :: " +getFirstnamename()+ " " + getLastnamename());
        System.out.println("Holder Account Type is      :: " + getAcctype());
        System.out.println("Holder Available Balance is :: " + getBalance());
        System.out.println("Holder Account Number is    :: " + getaccountnumber());
        System.out.println("Holder IFSC Code is         :: " + getIfsccode() + "\n\n");
    }


    public void deposit(int depositamount,Display_Details obj)
    {

    }

    public void withdraw(int withdrawamount)
    {
        balance = balance-withdrawamount;
    }

    public void updateblance(int depositamount) {
        balance = balance+depositamount;
        System.out.println("Deposit Successful! New balance: " + balance);
    }

}
