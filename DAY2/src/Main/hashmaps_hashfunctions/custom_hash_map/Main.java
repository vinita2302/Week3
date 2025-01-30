package Main.hashmaps_hashfunctions.custom_hash_map;
public class Main{
public static void main(String[] args) {
    SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
    map.put("apple", 1);
    map.put("banana", 2);
    map.put("orange", 3);

    System.out.println("apple: " + map.get("apple"));
    System.out.println("banana: " + map.get("banana")); // Output: 2
    map.remove("banana");
    System.out.println("banana: " + map.get("banana")); // Output: null
}
}