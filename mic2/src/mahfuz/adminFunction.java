package mahfuz;

import java.util.Scanner;

public class adminFunction extends Login{

    SellerAfterLogin SAL = new SellerAfterLogin();
    public void adminFunction() {
        int x = 0;

        String adminName = new String("Mahfuz");
        String adminId = new String("111");
        String adminPass = new String("2012");

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

                        System.out.println("Enter 1 to see Available Products.\n Enter 2 to see Sales Insight.");

                        int i = input.nextInt();
                        if (i == 1) {
                            SAL.ProductAvailable();
                        } else if (i == 2) {
                            SAL.SaleInsight();
                        } else {
                            System.out.println("Invalid Input :(");
                        }
                        // }

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