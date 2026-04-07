package Maps_And_Sets;
import java.util.HashMap;

public class Maps_STL {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ram",25); map.put("Shyam",35); 
        map.put("Deepak",17); map.put("Rahul",19);
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
