import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        // Create an empty hash table of size 100
        Hash h = new Hash(100);

        // Insert the keys into the hash table
        for (int x : nums) {
            h.insertItem(x);
        }

        // Retrieve the elements sorted by frequency
        List<Integer> sortedElements = h.getElementsByFrequency();

        // Convert the list to an array
        int[] result = new int[sortedElements.size()];
        for (int i = 0; i < sortedElements.size(); i++) {
            result[i] = sortedElements.get(i);
        }

        return result;
    }
}

class Hash {
    // Number of buckets
    private final int bucket;
    // Hash table of size bucket
    private final ArrayList<Integer>[] table;
    // Map to store the frequency of each element
    private final Map<Integer, Integer> frequencyMap;

    public Hash(int bucket) {
        this.bucket = bucket;
        this.table = new ArrayList[bucket];
        this.frequencyMap = new HashMap<>();
        for (int i = 0; i < bucket; i++) {
            table[i] = new ArrayList<>();
        }
    }

    // Hash function to map values to key
    public int hashFunction(int key) {
        return Math.abs(key % bucket);
    }

    public void insertItem(int key) {
        // Get the hash index of key
        int index = hashFunction(key);
        // Insert key into hash table at that index
        table[index].add(key);
        // Update the frequency map
        frequencyMap.put(key, frequencyMap.getOrDefault(key, 0) + 1);
    }

    public void deleteItem(int key) {
        // Get the hash index of key
        int index = hashFunction(key);

        // Check if key is in hash table
        if (!table[index].contains(key)) {
            return;
        }

        // Delete the key from hash table
        table[index].remove(Integer.valueOf(key));
        // Update the frequency map
        frequencyMap.put(key, frequencyMap.get(key) - 1);
        if (frequencyMap.get(key) == 0) {
            frequencyMap.remove(key);
        }
    }

    // Function to retrieve elements in increasing frequency
    public List<Integer> getElementsByFrequency() {
        // Convert the frequency map to a list of map entries
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        // Sort the list by the frequency value, then by key value in reverse order
        list.sort(Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue)
                            .thenComparing(Map.Entry.<Integer, Integer>comparingByKey().reversed()));

        // Create a list to store the sorted elements
        List<Integer> sortedElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sortedElements.add(entry.getKey());
            }
        }

        return sortedElements;
    }
}
