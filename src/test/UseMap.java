package test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("USA", "CA");
        map.put("India", "Mumbai");
        map.put("Bangladesh", "Dhaka");
        map.put("Pakistan", "Islamabad");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }

    }

}
/*
 * Demonstrate how to use Map that includes storing and retrieving elements.
 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
 * Use For Each loop and while loop with Iterator to retrieve data.
 */

