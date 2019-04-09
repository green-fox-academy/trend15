import java.util.HashMap;

public class Mapintroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("978-1-60309-452-8", "A Letter to Jo");
        map.put("978-1-60309-459-7", "Lupus");
        map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-1-60309-461-0", "The Lab");

        for (String name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(value + " (ISBN: " + key + ")");
        }
        //Remove the key-value pair with key 978-1-60309-444-3
        map.remove("978-1-60309-444-3");
        System.out.println();
        for (String name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(value + " (ISBN: " + key + ")");
        }
        System.out.println();
        //Remove the key-value pair with value The Lab


        for (String name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(value + " (ISBN: " + key + ")");

        }
        System.out.println();
        for (String name : map.keySet()) {
            if (map.get(name).equals("The Lab")) {
                map.remove(name);
            }
        }
        for (String name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(value + " (ISBN: " + key + ")");
        }
        map.put("978-1-60309-450-4","They Called Us Enemy");
        map.put("978-1-60309-453-5","Why Did We Trust Him?");

        String val = map.get("478-0-61159-424-8");
        System.out.println("The Value mapped to Key 478-0-61159-424-8 is: " + val);

        String val2 = map.get("978-1-60309-453-5");
        System.out.println("The Value mapped to Key 978-1-60309-453-5 is: " + val2);
    }
}
