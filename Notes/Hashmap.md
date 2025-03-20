# HashMap 

## Basic Concept 
- Hashmaps store key value pairs 
- Essentially it is an array that holds key value pairs at each index 
- Think of a key value pair as the correlation between a student name to a student's ID

## Java's Built in HashMap
### Initialization 
```java
// Import statement
import java.util.HashMap;
// Creating a HashMap
HashMap<KeyDataType, ValueDataType> hashmapName = new HashMap<>();
```
> **Important Notes:**
> - Data types for key and value must NOT be primitives
> - Use Java wrapper classes (e.g., int → Integer)
### Example Creation
```java 
HashMap<String, Integer> studentID = new HashMap<>();
// Key: student's name (String)
// Value: student's ID number (Integer) 
``` 
### Common Methods 
#### Adding Elements to HashMap
```java 
studentID.put("Alfred", 12345);  // O(1) time complexity 
```
#### Retrieving Elements from HashMap
```java 
studentID.get("Alfred");  // returns 12345, O(1) time complexity
```
#### Checking Contents
```java
// Check if key exists
studentID.containsKey("Alfred");      // returns true, O(1) time complexity
studentID.containsKey("LeBron James"); // returns false

// Check if value exists
studentID.containsValue(12345);  // returns true, O(n) time complexity
studentID.containsValue(00000);  // returns false
```
#### Modifying Elements 
```java
// Override existing key's value
studentID.put("Alfred", 54321);  // changes value from 12345 to 54321

// Replace value only if key exists
studentID.replace("Alfred", 54321);  // O(1) time complexity
// Note: If the key doesn't exist, replace() does nothing

// Add only if key doesn't exist
studentID.putIfAbsent("LeBron James", 23);  // adds entry since key doesn't exist
```

## Application of HashMap in LeetCode Style Question 
**Problem:** Given two int arrays, determine whether they have any element in common.
**Solution:** 
```java
public static boolean itemInCommon(int[] nums1, int[] nums2) {
    // Create a hashmap to store elements from first array
    HashMap<Integer, Boolean> hashmap = new HashMap<>(); 

    // Add all elements from first array as keys
    for (int i : nums1) {
        hashmap.put(i, true); 
    }

    // Check if any element from second array exists in hashmap
    for (int j : nums2) { 
        if (hashmap.get(j) != null) return true; 
    }

    // No common elements found
    return false; 
}
// Time Complexity: O(n)
```

## Building Our Own HashMap 
### Constructor 
```java
public class hashmap {
    private int size = 7; 
    private Node[] dataMap; 

    class Node {
        String key; 
        int value; 
        Node next; 
        Node(String key, int value){
            this.key=key; 
            this.value=value; 
        }
    }

    public hashmap() {
        dataMap = new Node[size]; 
    }
}
```
> - **Important Notes:**
> - Custom Hash Map Implementation: Builds your own hash map from scratch using an array and linked list chaining
> - Fixed Initial Size: Starts with 7 buckets (array of Nodes)
> - Node Class for Chaining: Each Node holds a key, value, and next pointer for collision handling.
> - Handles Collisions with Linked Lists: Multiple nodes can chain together at the same bucket when collisions occur
> - Constructor Sets Up Buckets: Initializes the dataMap array with the default size on object creation 


### Hash Function
```java
private int hashFunction(String key) {
        int hash = 0; 
        char[] keyChars = key.toCharArray(); 
        for (int i = 0; i < keyChars.length; i++) {
            int asciivalue = keyChars[i]; 
            hash = (hash + asciivalue * 23 ) % dataMap.length; 
        }
        return hash; 
}
```
> **Important Notes:**
> - Maps key to index: Converts a key into an array index where data will be stored
> - Deterministic: Same key = same index every time
> - Modulo Keeps Index In Bounds: Using % dataMap.length ensures index is valid
> - Spreads Keys Out: Multiplying by 23 (prime number) and summing helps reduce collisions by mixing values
> - All objects in Java automatically inherit a .hashCode() function
> - **Hash Function can vary**

### Set Function
```java 
public void set(String key, int value) {
        int index = hashFunction(key);
        Node newnode = new Node(key,value); 
        if (dataMap[index] == null) {
            dataMap[index] = newnode; 
        } else {
            Node temp = dataMap[index]; 
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = newnode; 
        }
}
```
> - **Important Notes:**
> - Stores Key-Value Pair: Adds a new key-value pair into the hash map
> - Uses Hash Function: Finds the correct index via hashFunction(key)
> - Handles Empty Buckets: If no node exists at the index, directly inserts the new node
> - Handles Collisions (Chaining): If nodes already exist (collision), traverses linked list and appends the new node at the end
> - Preserves Existing Data: Never overwrites existing nodes at the same index, just links new node to the chain 

### Get Function 
```java
public int get(String key) {
        int index = hashFunction(key); 
        Node temp = dataMap[index]; 
        while (temp != null ){
            if (temp.key == key) return temp.value; 
            temp = temp.next; 
        }
        return 0; 
}
```
> - **Important Notes:**
> - Retrieves Value by Key: Searches for a key and returns its corresponding value
> - Uses Hash Function: Calculates the index where the key might be stored
> - Traverses Chain (if needed): If collisions occurred, loops through linked list at the index
> - Checks for Matching Key: Compares each node’s key; returns value when found
> - Returns Default if Not Found: Returns 0 if the key is not present in the hash map

## Collision Handling 
- Collision are caused when two keys map to the same index 
- There are multiple ways we can handle collision: (1) Linear Probing (2) Seperate Chaining 

## Time Complexity of Common Operations with HashMap 

| Operation | Method | Average Case | Worst Case | Description |
|-----------|--------|--------------|------------|-------------|
| Put       | `put(K key, V value)` | O(1) | O(n) | Adds a key-value pair to the map |
| Get       | `get(Object key)` | O(1) | O(n) | Returns the value for the specified key |
| Remove    | `remove(Object key)` | O(1) | O(n) | Removes the mapping for the specified key |
| ContainsKey | `containsKey(Object key)` | O(1) | O(n) | Returns true if map contains the key |
| ContainsValue | `containsValue(Object value)` | O(n) | O(n) | Returns true if map contains the value |
| Size      | `size()` | O(1) | O(1) | Returns the number of key-value pairs |
| IsEmpty   | `isEmpty()` | O(1) | O(1) | Returns true if map contains no mappings |
| Clear     | `clear()` | O(n) | O(n) | Removes all mappings from the map |
| KeySet    | `keySet()` | O(1) | O(1) | Returns a Set view of the keys |
| Values    | `values()` | O(1) | O(1) | Returns a Collection view of the values |
| Replace   | `replace(K key, V value)` | O(1) | O(n) | Replaces the entry for the key |




