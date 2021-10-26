package mahfuz;
import java.util.Scanner;

public class Seller extends Login{

    public Scanner input = new Scanner(System.in);
   Login log = new Login();

    public void Seller()
    {
        System.out.println("1. Already Have a Shop? LOG IN \n 2. New Here? Create a New Shop.");
       // int ExistOrNew = input.nextInt();
       // int ExistOrNew = input.nextLine().charAt(0);
        int ExistOrNew = input.nextInt();

        if(ExistOrNew == '1')
        {
            //log.login();
          new  SellerAfterLogin();
        }
        else if (ExistOrNew == '2')
        {
            System.out.println("Please, Contact Our Admin With Proper Documents to Create & Register Your online Store.");
            System.out.println("Enter 1 to see the required documents \n Enter 2 to See the Admin's Information.");
            int ExtraInfo = input.nextLine().charAt(0);
            if(ExtraInfo == '1')
            {
                System.out.println("The Required Documents are: ");
                System.out.println("1)Trade Licence\n2)National Identity Card(NID)\n3.Passport\n4.Bank Statements(Last 1 Years)");
            }
            else if(ExtraInfo=='2')
            {
                System.out.println("Admin's Contact Information:");
                System.out.println("Name: Shafi Ragnar\n Phone:+880161506014\nEmail:admin@smms.com");
                System.out.println("Thank You :)");
            }
            else
            {
                System.out.println("Something Went Wrong.\n Wrong Input. :(");
            }
        }

        else
        {
            System.out.println("Something Went Wrong.\n Wrong Input. :(");
        }
    }

}
