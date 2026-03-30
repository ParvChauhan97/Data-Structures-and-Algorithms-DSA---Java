package Stacks;
import java.util.Scanner;

// Main project class
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        while (true) {
            System.out.print("Enter stack size: ");
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                sc.nextLine(); 
                if (size > 0) break;
                else System.out.println("Stack size must be positive!");
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // skip invalid input
            }
        }

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            int choice = 0;

            System.out.print("Enter your choice: ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a number between 1-5.");
                sc.next(); // skip invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    if (sc.hasNextInt()) {
                        int value = sc.nextInt();
                        sc.nextLine();
                        stack.push(value);
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                        sc.next(); // skip invalid input
                    }
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }
        }
    }
}
