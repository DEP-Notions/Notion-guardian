import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Customer, Integer> map = new TreeMap<>();
        map.put(new Customer(3, "kasun", "galle"), 3);
        map.put(new Customer(2, "ruwan", "panadura"), 2);
        map.put(new Customer(1, "supun", "colombo"), 1);



    }
}
