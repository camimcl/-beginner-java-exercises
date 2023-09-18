/*
A fast food chain has these meals
Meal	Price
Burger	5$
Pizza	3$
Hot Dog	1,5$
Create a program that:

Reads the meal the customer wants
Prints the cost of the meal
Input example: "Hot Dog"
Output: "Hot Dog 1,50$"

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        int error = 1;
        while (error == 1){
        System.out.println("--MENU--");
        System.out.println("Burguer");
        System.out.println("Pizza");
        System.out.println("Hot Dog");
        System.out.println("Choose what you want to eat");
        String choice = sc.nextLine();

        switch (choice){
            case "burguer":
                System.out.println("Burguer "+menu.getBurguer()+" $");
                error=0;
                break;
            case "pizza":
                System.out.println("Pizza "+menu.getPizza()+" $");
                error=0;
                break;
            case "hot dog":
                System.out.println("Hot Dog "+menu.getHotDog()+" $");
                error=0;
                break;
            default:
                System.out.println("Sorry, this option is not available");
                break;
        }
    }}
}
