import java.util.HashMap;

public class Mapintroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> store = new HashMap<Integer, Character>();
        System.out.println("Is the store empty?:" + store.isEmpty());
        store.put(97, 'a');
        store.put(98, 'b');
        store.put(99, 'c');
        store.put(65, 'A');
        store.put(66, 'B');
        store.put(67, 'C');
        System.out.println(store.keySet());
        System.out.println(store.values());
        store.put(68, 'D');
        System.out.println("How many keys-values has the HasMap: " + store.size());

        char val = store.get(99);
        System.out.println("The Value mapped to Key 99 is: " + val);

        //Remove the key-value pair where with key 97
        store.remove(store.get(97)); // erase value and key too;

        char val2 = store.get(100);
        System.out.println("The Value mapped to Key 99 is: " + val2);
        store.clear();

    }
}

