package Maps_And_Sets;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets_STL {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(77); set.add(65); set.add(2); set.add(2);
        set.add(11); set.add(45); set.add(3); set.add(77);

        for(int ele : set){
            System.out.print(ele+" ");
        }
        set.clear();
        System.out.println();
        for(int ele : set){
            System.out.print(ele+" ");
        }
    }
}
