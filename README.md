# Restaurant-
We have created a simple java code for restaurant management 

import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Bites Restaurant!");
        System.out.println("------ Menu Card ------");
        System.out.println("1. Burger     - ₹100");
        System.out.println("2. Pizza      - ₹150");
        System.out.println("3. Sandwich   - ₹80");
        System.out.println("4. Coffee     - ₹60");
        System.out.println("------------------------");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You ordered: Burger - ₹100");
                break;
            case 2:
                System.out.println("You ordered: Pizza - ₹150");
                break;
            case 3:
                System.out.println("You ordered: Sandwich - ₹80");
                break;
            case 4:
                System.out.println("You ordered: Coffee - ₹60");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
