package Map_And_Sets_Project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1 Add Contact");
            System.out.println("2 Search Contact");
            System.out.println("3 Delete Contact");
            System.out.println("4 Show All Contacts");
            System.out.println("5 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();

                manager.addContact(name, phone);
            }

            else if(choice == 2) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                manager.searchContact(name);
            }

            else if(choice == 3) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                manager.deleteContact(name);
            }

            else if(choice == 4) {
                manager.displayContacts();
            }
            else if(choice == 5) {
                break;
            }
        }
    }
}
