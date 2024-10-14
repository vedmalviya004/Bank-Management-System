import java.util.ArrayList;
import java.util.HashMap;
import java.lang.*;
public class Database  {

    Display_Details dd = new Display_Details();
    static public int index;
    static public int indexof;

   static ArrayList<Long> mylist = new ArrayList<>();
   static HashMap <Integer ,Display_Details> mymap = new HashMap<>();

    public void set_accnum_list(long accnumber)
    {

        mylist.add(Long.valueOf(accnumber));

        findIndex(mylist.indexOf(accnumber));
//        System.out.println("Account number " + accnumber + " added to the list.");
//        System.out.println("set_accnum_list");
//        System.out.println(mylist);
//        System.out.println(mylist.indexOf(accnumber));

    }

    public void findIndex(int indexx)
    {
        index = indexx;
//        System.out.println("I am index"+index);
    }

    public void getobject(Display_Details obj )
    {
        mymap.put(index,obj);
//        System.out.println("Object added to HashMap with index: " + index);
//        System.out.println("HashMap contents: " + mymap);
//        System.out.println(mymap.get(0).toString());
    }

    public boolean checkaccnumber(long accnumber)
    {
//        System.out.println(mylist);
//        System.out.println("i am accoun number "+accnumber);
        boolean result = mylist.contains(accnumber);
//        System.out.println("Check number " + result);
        if(result)
        {
//            System.out.println(" True ke ander account number " + accnumber);
             indexof =mylist.indexOf(accnumber);
//            System.out.println(" True ke ander indexof "+indexof);
//            System.out.println(result);
            return true;
        }
        else
            return false;
    }

    public Display_Details displayholderdetails()
    {
//        System.out.println("Send the object");
//        System.out.println("Object ="+mymap.get(indexof));
//        System.out.println("Indexof =" + indexof);
       return mymap.get(indexof);
    }

    public void deleteholderdetails( long accuntnumber)
    {
//        System.out.println("before remove\n"+mylist);
         int deletekey = mylist.indexOf(accuntnumber);
         mymap.remove(deletekey);
         mylist.remove(deletekey);
//        System.out.println("After remove\n"+mylist);
    }

}

