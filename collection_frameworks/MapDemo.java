// Map: a map is an object that maps keys to value, it cannot contain duplicate keys, and each key can map to at least one value.
// Map does not extend collection interface

package collection_frameworks;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "mukesh");
        map.put(2, "kamlesh");
        map.put(3, "harshit");
        map.put(4, "ankit");
        System.out.println();
        System.out.println("map " + map); // {1=mukesh, 2=kamlesh, 3=harshit, 4=ankit}
        System.out.println("get Item from key 4 is " + map.get(4));
        System.out.println("if present key 5 is " + map.containsKey(5));
        System.out.println("remove key "+ map.remove(2)); // return removed value
        System.out.println("map" + map);
    }
}


// Common HashMap Methods:
// 1. put(K key, V value): Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced by the specified value.
// 2. get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
// 3. remove(Object key): Removes the mapping for the specified key from this map if present.
// 4. containsKey(Object key): Returns true if this map contains a mapping for the specified key.
// 5. containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
// 6. size(): Returns the number of key-value mappings in this map.
// 7. isEmpty(): Returns true if this map contains no key-value mappings.
// 8. clear(): Removes all of the mappings from this map.
// 9. keySet(): Returns a Set view of the keys contained in this map.
// 10. values(): Returns a Collection view of the values contained in this map.. 
// 11. entrySet(): Returns a Set view of the mappings contained in this map. Each element in the set is a Map.Entry<K, V>.
// 12. putIfAbsent(K key, V value): If the specified key is not already associated with a value (or is mapped to null), associates it with the given value and returns null, else returns the current value.
// 13. replace(K key, V value): Replaces the entry for the specified key only if it is currently mapped to some value.
// 14. replace(K key, V oldValue, V newValue): Replaces the entry for the specified key only if currently mapped to the specified old value.
// 15. compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction): Attempts to compute a mapping for the specified key and its current mapped value (if any).
// 16. computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction): If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
// 17. computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction): If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.