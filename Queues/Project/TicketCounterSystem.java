package QueueProject;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    public class TicketCounterSystem {
        public static void main(String[] args) {
            Queue<String> queue = new LinkedList<>();
            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.println("\n---- Ticket Counter Menu ----");
                System.out.println("1. Add Customer");
                System.out.println("2. Serve Customer");
                System.out.println("3. Show Waiting Customers");
                System.out.println("4. Show Next Customer");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice){
                    case 1:
                        System.out.print("Enter customer name: ");
                        String name = sc.nextLine();
                        queue.add(name);
                        System.out.println(name + " added to queue.");
                        break;

                    case 2:
                        if(queue.isEmpty()){
                            System.out.println("No customers in queue.");
                        } else {
                            System.out.println(queue.remove() + " served.");
                        }
                        break;

                    case 3:
                        System.out.println("Waiting Customers: " + queue);
                        break;

                    case 4:
                        if(queue.isEmpty()){
                            System.out.println("Queue is empty.");
                        } else {
                            System.out.println("Next Customer: " + queue.peek());
                        }
                        break;

                    case 5:
                        System.out.println("System Closed.");
                        return;

                    default:
                        System.out.println("Invalid choice.");
             }
        }
    }
}
