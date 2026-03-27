package Array;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array: ");
        int n = sc.nextInt();

        System.out.print("Enter Element in Array: ");
        int[] arr = new int[n];
         for(int i = 0; i<n; i++) {
             arr[i] = sc.nextInt();
         }

        System.out.print("Enter the Target: ");
         int target = sc.nextInt();

        System.out.print(twoSum(arr, target));
    }

    public static boolean twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}
