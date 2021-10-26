package mahfuz;
import java.util.Scanner;


public class SellerAfterLogin extends Seller{
    public Scanner input = new Scanner(System.in);
    //ProductsAvailable product = new ProductsAvailable();
    //AddProducts addGoods = new AddProducts();
    //SalesInsights insights = new SalesInsights();

    public void SellerHome()
    {
        //System.out.println("Welcome Back"+SellerName());
        System.out.println("Welcome Back!!!");
        System.out.println("Enter 1 to see the available products.");
        System.out.println("Enter 2 to Add more Products.");
        System.out.println("Enter 3 to see your sales insights.");

        int ShopWatch = input.nextLine().charAt(0);

        if(ShopWatch == '1')
        {
            //product.ProductAvailable();
            ProductAvailable();
        }
        else if (ShopWatch == '2')
        {
            //addGoods.AddProduct();
            AddProduct();
        }
        else if(ShopWatch == '3')
        {
            //insights.SalesInsights();
            SaleInsight();
        }
        else
        {
            System.out.println("Something Went Wrong.\n Wrong Input. :(");
        }


    }

    public void ProductAvailable() {
        Seller1Goods();
    }

    public void Seller1Goods() {
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|               GadgetLovers Shop                  |");
        System.out.println("\t\t|      Product Name       ||      Product Code     |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    GoPro Hero 7 Black   ||          GoH7         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    GoPro Hero 8 Black   ||          GoH8         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    GoPro Hero 9 Black   ||          GoH9         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    HP Pavilion Laptop   ||          HPPL         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|      HP Envy Laptop     ||          HPEL         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    HP Spectre Laptop    ||          HPSL         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    HP Probook Laptop    ||          HPProL       |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t----------------------------------------------------");

    }

    public void AddProduct() {
        System.out.println("Please,Contact out admin and researcher team to add a new product.");
        System.out.println("Things to bring:\n1.Product Sample\n2.Trade License\n3.Importing Documents\n4.Buying memo and expected price.");
    }

    public void SaleInsight() {
        System.out.println("Seller ID: 201\nSeller Name: David \n Trade License No: 322145\nNID:9754467532 ");
        System.out.println("|----------Sales Insights:----------|");
        System.out.println("|----------Total Items Availabe: 15 ----------|");
        System.out.println("|----------All Time Sales: $37000 ----------|");
        System.out.println("|---------- Total Customer: 154 ----------|");
        System.out.println("|---------- Repeating Customer: 96 ----------|");
        System.out.println("|---------- Total Revenue: $12210 ----------|");
        System.out.println("|---------- Revenue in This month:$1440 ----------|");

        System.out.println("|----------Revenue Graph----------|\n|----------This year:----------|");
        System.out.println("Month:9:                     /");
        System.out.println("Month:8:                    /");
        System.out.println("Month:7:           --------");
        System.out.println("Month:6:          / ");
        System.out.println("Month:5:         /");
        System.out.println("Month:4:     ---");
        System.out.println("Month:3:    /");
        System.out.println("Month:2:   /");
        System.out.println("Month:1: --");


    }
}
