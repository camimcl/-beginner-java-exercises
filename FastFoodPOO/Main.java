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
        Scanner scanner = new Scanner(System.in);
        LoginPage loginpage = new LoginPage();
        String userName, password;

        while (true) {
            System.out.println("1- Login");
            System.out.println("2- Exit program");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("UserName Login: ");
                userName = scanner.nextLine();

                System.out.println("Password: ");
                password = scanner.nextLine();

                loginpage.Login(userName, password);
            } else if(choice == 2) {
                break;
            } else {
                System.out.println("Eita macho burro, so tem duas opcoes, escolhe uma.");
            }

        }
    }
}
