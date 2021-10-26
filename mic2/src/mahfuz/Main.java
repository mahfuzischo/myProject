package mahfuz;

import java.util.Scanner;

public class Main {

    public Scanner input =new Scanner(System.in);
    //public Scanner input = new Scanner(System.in);
    public void Design()
    {
        System.out.println(" |=================================================================|");
        System.out.println(" |.................................................................|");
        System.out.println(" |........================================================.........|");
        System.out.println(" |.......|                                                |........|");
        System.out.println(" |.......|   >>  Shopping Mall Management Project   <<    |........|");
        System.out.println(" |.......|                                                |........|");
        System.out.println(" |........================================================.........|");
        System.out.println(" |.................................................................|");
        System.out.println(" |=================================================================|");
        System.out.println("");

        System.out.println(" .........Welcome to the Shopping Mall Management Project...........");
    }

    public static void main(String[] args) {
        Main ob = new Main();
        ob.Design();
        Login l = new Login();
        l.login();
        adminFunction ad = new adminFunction();
        ad.adminFunction();
    }
}
