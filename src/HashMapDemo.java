import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
         /*1)- создать hashmap, занести в нее любые 10 пар ключ - значение (типа String)
            - вывести на консоль значение всех ключей и значений с помощью метода entrySet()
            - вывести на консоль значение всех ключей и значений с помощью метода keySet()*/

        Map<Integer, String> cities = new HashMap();
        cities.put(1, "Kiev");
        cities.put(2, "Lviv");
        cities.put(3, "Rome");
        cities.put(4, "London");
        cities.put(6, "Cologne");
        cities.put(7, "Prague");
        cities.put(8, "Munich");
        cities.put(9, "Dnipro");
        cities.put(10, "Paris");

        System.out.println("Implementation with entrySet");
        Set<Map.Entry<Integer, String>> set = cities.entrySet();
        for (Map.Entry city : set) {
            System.out.println(city.getKey() + " : " + city.getValue());
        }

        System.out.println("Implementation with keySet");
        Set<Integer> keySet = cities.keySet();
        for (Integer keys : keySet) {
            System.out.println(keys + " - " + cities.get(keys));

        }
    }
}
