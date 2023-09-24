import java.util.HashMap;
import java.util.Scanner;

public class AttenderPage {
    HashMap<String, Double> Products;
    Scanner sc = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);
    public AttenderPage(HashMap<String, Double> products){ //endereço na memoria
        this.Products = products;
    }
    public void AttenderMenu() {
        boolean error = false;
        int option;
        while (!error) {
            System.out.println("--MENU--");
            System.out.println(Products);
            System.out.println("Choose what you want:");
            String choice = sc.nextLine();
            switch (choice) {
                case "burguer":
                    System.out.println("Burguer : $" + Products.get("Burguer"));
                    break;
                case "pizza":
                    System.out.println("Pizza : $" + Products.get("Pizza"));
                    break;
                case "hot dog":
                    System.out.println("Hot Dog : $" + Products.get("Hot Dog"));
                    break;
                case "fries":
                    System.out.println("Fries : $"+Products.get("Fries"));
                    break;
                default:
                    System.out.println("Sorry, this option is not available");
                    error = true;
                    break;
            }

            System.out.println("Do you want anything else?\n1-Yes\n2-No");
            option = scan.nextInt();
            if (option == 1 ){
                error = false;
            }
            if (option == 2){
                System.out.println("Ok,Closing program.");
                error = true;
            }
        }
    }
}
