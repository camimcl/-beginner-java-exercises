import java.util.Scanner;

class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            // throw error
        }

        return a / b;
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        boolean first_run = true;
        while (true) {
            if (!first_run) {
                System.out.println("Do you want to make another operation?");
                System.out.println("0- No");
                System.out.println("1- Yes");

                int exit_option = scanner.nextInt();

                if (exit_option == 0) {
                    break;
                }
            }

            System.out.println("Type a:");
            double a = scanner.nextDouble();

            System.out.println("Type b:");
            double b = scanner.nextDouble();

            System.out.println("Operation: ");
            System.out.println("1- Sum: ");
            System.out.println("2- Sub: ");
            System.out.println("3- Div: ");
            System.out.println("4- Mul: ");
            int choose = scanner.nextInt();

            double result = 0;
            boolean error_occurred = false;
            switch (choose) {
                case 1:
                    result = calculator.sum(a, b);
                    break;
                case 2:
                    result = calculator.subtract(a, b);
                    break;
                case 3:
                    if (b == 0) {
                        System.out.println("MATH ERROR. CAN'T DIVIDE BY ZERO");
                        error_occurred = true;
                    } else {
                        result = calculator.divide(a, b);
                    }

                    break;
                case 4:
                    result = calculator.multiply(a, b);
                    break;
            }

            if (!error_occurred) {
                System.out.println("The answer is: " + result);
            }

            if (first_run) {
                first_run = false;
            }
        }
    }
}