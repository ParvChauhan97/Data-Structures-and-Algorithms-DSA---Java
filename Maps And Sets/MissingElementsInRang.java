package Maps_And_Sets;
import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementsInRange {
  public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>(arr.length);
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        for(int i=low;i<=high;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}
