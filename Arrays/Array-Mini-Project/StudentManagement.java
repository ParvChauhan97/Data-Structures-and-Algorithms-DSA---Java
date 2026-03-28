package ArrayProject;
import java.util.Scanner;

public class StudentManagement {
    static Student[] students = new Student[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Search Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Exit");

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    deleteStudent(sc);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }

    static void addStudent(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        students[count] = new Student(id, name, age);
        count++;

    }

    static void viewStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(
                    students[i].id + " " +
                    students[i].name + " " +
                    students[i].age  );
        }
    }

    static void searchStudent(Scanner sc) {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                System.out.println("Found: " + students[i].name);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    static void deleteStudent(Scanner sc) {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                count--;
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Student Not Found");
    }
}
