package Array;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter element in Array: ");
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // calculate max
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        // calculate second max
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        System.out.println("First Max is: " + max);
        System.out.println("Second Max is: " + smax);
    }
}
