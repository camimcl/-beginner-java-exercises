/*
You want to buy something from Amazon. The seller charges
different prices for shipping cost based on location.
For US it's 5$ for Europe it's 7$ for Canada it's 3$ for other places it's 9$

Create a program that:

Reads the cost of the product
Reads your location
Print the amount of money you have to pay
Ouput: "You have to pay 23$, 20$ for the product and 3$ for shipping cost"

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner location = new Scanner(System.in);
        ShippingTaxes shippingtaxes = new ShippingTaxes();

        System.out.println("How much does the product cost? ");
        double productPrice = sc.nextDouble();

        System.out.println("Select your location:");
        System.out.println("Europe");
        System.out.println("North America");
        System.out.println("South America");
        System.out.println("Oceania");
        System.out.println("Asia");
        System.out.println("Africa");
        String clientLocation = location.nextLine();
        shippingtaxes.setLocationTax(clientLocation);

        System.out.println("You have to pay "+productPrice+"$ for the product");
        System.out.println("You have to pay "+shippingtaxes.getLocationTax()+"$ import tax");
        System.out.println("Total: US$"+(+productPrice+shippingtaxes.getLocationTax()));
    }
}
