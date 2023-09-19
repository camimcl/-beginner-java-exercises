import java.util.Scanner;

/*
You have started working and you are wondering how many things
you can buy with the money you've earned. A PS4 costs 200$, a
Samsung phone 900$, a TV 500$, a game skin 9.99$

Create a program:

Notice that you can't but half TV or 1/4 of PS4.
Reads how many hours you've worked
Reads your hourly income
Prints how many items you can buy
Output: "I can buy 4 PS4, 1 Samsung, 3 TV, 80 game skin"
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wishlist wishlist = new Wishlist();

            System.out.println("WISHLIST");
            System.out.println("PS4 : US$200");
            System.out.println("SAMSUNG PHONE : US$900");
            System.out.println("TV : US$500");
            System.out.println("GAME SKIN : US$9.99");

            System.out.println("How many hours have you worked?");
            double workHours = sc.nextDouble();
            System.out.println("How much do you earn per hour?");
            double hourlyIncome = sc.nextDouble();

            wishlist.userMoneyCalc(workHours, hourlyIncome);

            System.out.println("You can buy :");
            System.out.println((int) wishlist.buyTv() + " TV(S)");
            System.out.println((int) wishlist.buyPs4() + " PS4(S)");
            System.out.println((int) wishlist.buyPhone() + " PHONE(S)");
            System.out.println((int) wishlist.buySkin() + " SKIN(S)");
           
    }
}