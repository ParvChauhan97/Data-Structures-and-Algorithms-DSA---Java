package Array;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
      
        String[] arr = new String[n];
      
        System.out.println("Enter element in Array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.next();
        }

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
               //----Second Method----
      
//       String[] arr = {"Rahul","Mohit","Ram","Rani","Sita"};
//        for(int i=0;i<arr.length;i++){
 //           System.out.println(arr[i]+" ");
 //       } 
    }
}
