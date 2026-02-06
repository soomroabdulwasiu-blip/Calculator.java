import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Simple Java Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result = " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        System.out.println("Calculator closed.");
        input.close();
    }
}