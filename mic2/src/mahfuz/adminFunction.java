package mahfuz;

import java.util.Scanner;

public class adminFunction extends Login{

    public void adminFunction() {
    /*System.out.println();

        System.out.println("We select you as a admin.");

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Enter your ID No:");
        int id = input.nextInt();
        System.out.println(name);
        System.out.println(id);


        if(id==111 || id==121 || id==127) {
            login();*/

        int x = 0;

        String adminName = new String("Mashafi");
        String adminId = new String("mma112127");
        String adminPass = new String("2012020112127");

        while (x == 0) {
            System.out.println("Enter your name: ");
            String name = new String(input.nextLine());

            System.out.println("Enter your ID: ");
            String id = new String(input.nextLine());

            if (name.equals(adminName) && id.equals(adminId)) {
                x = x + 1;

                int m = 0;
                while (m == 0) {

                    System.out.println("Enter your password: ");
                    String passWord = new String(input.nextLine());

                    if (passWord.equals(adminPass)) {
                        m = m + 1;
                        System.out.println("Good Job!!!");
                    } else {
                        System.out.println("Incorrect password");
                    }
                }
            } else {
                System.out.println("Incorrect id or username!!!");
                System.out.println("Enter again!!! ");
            }
        }
    }
}

