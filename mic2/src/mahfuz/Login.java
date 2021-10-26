package mahfuz;

import java.util.Scanner;

public class Login  {
    public Scanner input = new Scanner(System.in);


    public void login()
    {
        System.out.println("Log in as:  ");
        System.out.println("            1. Buyer");
        System.out.println("            2. Seller");
        System.out.println("            3. Admin");
        System.out.println("\nChose an option: 1/2/3: ");

        int loginOption = input.nextInt();


        switch (loginOption){
            case 1 :
                buyerFunction();
                break;
            case 2:
                new Seller();
             case 3:
                 new adminFunction();
            //default:
            //   break;

        }
    }




    public  void buyerFunction(){

        System.out.println(" We select you as  a buyer. ");
        System.out.println("Choose an option: ");
        System.out.println(" 1. Maps        2. Your Thoughts        3. About Ourself");
        System.out.println("            4. Search Product       5. Search Shop");
        System.out.println("                         6. All Shop List");
        System.out.println("Select an option:  ");

        //while(optionSelect){
        // problem
        int optionSelect = input.nextInt();

        switch (optionSelect)
        {

            case 1 :
                System.out.println("_____________________________________________________");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||    1      ||    2      ||    3      ||       4   ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println( "'''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.println("_____________________________________________________");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||    5      ||    6      ||    7      ||       8   ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println( "'''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.println("-----------------------------------------------------");

                buyerFunction();
                break;
            case 2 :
                System.out.println("Please write some word about your experience with us");
                System.out.println("Please write your comment here:  ");
                Scanner input = new Scanner(System.in);
                String comment = input.nextLine();
                System.out.println(comment);
                break;
            case 3 :
                System.out.println("This is a console based project.");
                System.out.println("Using Object Oriented Programming language.");
                System.out.println("This project contributed by 3 person.");
                System.out.println("");
                break;
            case 4 :
                System.out.println("Here you can search all our products");

                break;
            case 5 :
                System.out.println("Here you can search all our Shop.");
                break;
            case 6 :
                System.out.println("Here you can see all our shop.");
                break;
            default:
                buyerFunction();
                break;

        }

    }

    /*public void adminFunction(){

        System.out.println("We select you as a admin.");

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Enter your ID No:");
        int id = input.nextInt();
        System.out.println(name);
        System.out.println(id);


        if(id==111 || id==121 || id==127){
            login();
        }*/




}
//*****************************Call admin function *************************************
//public void adminFunction{}






