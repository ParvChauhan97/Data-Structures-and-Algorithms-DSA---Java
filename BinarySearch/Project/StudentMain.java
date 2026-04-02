package BinarySearch;
import java.util.*;

public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Aman"),
                new Student(102, "Ravi"),
                new Student(103, "Neha"),
                new Student(104, "Priya"),
                new Student(105, "Karan")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to search: ");
        int target = sc.nextInt();
        int index = binarySearch(students, target);

        if (index != -1) System.out.println("Student Found: " + students[index].name);
         else System.out.println("Student Not Found");
        }
    }
