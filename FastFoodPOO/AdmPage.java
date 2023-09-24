import java.util.HashMap;
import java.util.Scanner;
public class AdmPage {
    HashMap<String, Double> Products;
    Scanner scanner = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    public AdmPage(HashMap<String, Double> products){
        this.Products = products;
    }

    private void setPrices(){
        double newPrice;
        System.out.println(Products);
        System.out.println("Choose what u want to change:");
        String option = sc.nextLine();

        if (option.equalsIgnoreCase("hot dog")){
            System.out.println("Type new price:");
            newPrice = scanner.nextDouble();
            Products.replace("Hot Dog", +newPrice);
            System.out.println("Hot Dog : $" + Products.get("Hot Dog"));
        }
        else if (option.equalsIgnoreCase("pizza")){
            System.out.println("Type new price:");
            newPrice  = scanner.nextDouble();
            Products.replace("Pizza", +newPrice);
            System.out.println("Pizza : $" + Products.get("Pizza"));
        }
        else if(option.equalsIgnoreCase("burguer")){
            System.out.println("Type new price:");
            newPrice = scanner.nextDouble();
            Products.replace("Burguer", +newPrice);
            System.out.println("Burguer : $" +Products.get("Burguer"));
        }
        else if (option.equalsIgnoreCase("fries")){
            System.out.println("Type new price:");
            newPrice= scanner.nextDouble();
            Products.replace("Fries", +newPrice);
            System.out.println("Fries : $" + Products.get("Fries"));
        }
    }
    private void getPrices(){
        System.out.println(Products);
    }

    public void changePrices() {
        boolean exit = false;
        while (!exit) {
            int choice;
            System.out.println("Do you want to change any product ? \n1-Yes\n2-No\n3-Leave\n4-Relog");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                setPrices();
            }
            if (choice == 2) {
                getPrices();
                break;
            }
            if (choice == 3) {
                System.out.println("Closing program.");
                exit = true ;
            }
            if (choice==4){
                break;
            }
            }
        }

    }




