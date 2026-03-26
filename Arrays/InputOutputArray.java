package Arrays;
import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5,-8,2,67,43,-97,6,23,89};
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }

        int[] arr = new int[7];
//        for(int i=0;i<7;i++){
//            System.out.print(karan[i]+" ");
//        }
        // input
        for(int i=0;i<7;i++){
            arr[i] = sc.nextInt();
        }
        // print
        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
