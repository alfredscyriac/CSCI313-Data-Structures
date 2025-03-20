# HashMap 

## Basic Concept 
- Hashmaps store key value pairs 
- Essentially it is an array that holds key value pairs at each index 
- Think of a key value pair as the correlation between a student name to a student's ID

## Java's Built in HashMap
- To use the built-in Java hasmaps first you have to import it 
```java 
import java.util.HashMap;
```
- To intialize it within your code 
```java 
HashMap<keyDataType,valueDataType> hashmapName = new HashMap<>();
``` 
- Note: **Data types for key and value must NOT be primitives**
- Tip: Use java wrapper classes (i.e.: int --> Integer)
- Sample use case of hashmap:
```java 
HashMap<String,Integer> studentID = new HashMap<>(); 
``` 
- In the case above the key is the student's name and the value is the student's ID number 
- We can add an element to our hashmap using the .put() function 
- Sample use case of .put(): 
```java 
studentID.put("Alfred",12345); 
```
- The time complexity of .put() is O(1)
- You can retrieve the value stored at a key using .get() function 
- Sample use case of .get():
```java 
studentID.get("Alfred"); // returns 12345
```
- The time complexity of .get() is O(1)
- You can check if the hash map currently has a key value pair with a certain key using .containsKey() function
- Sample use case of .containsKey():
```java
studentID.containsKey("Alfred"); // returns true 
studentID.containsKey("LeBron James"); // returns false
```
- The complexity of .containsKey() is O(1) 
- You can check if the hash map currently has a key value pair with a certain value using .containsValue() function
- Sample use case of .containsValue():
```java
studentID.containsValue(12345); // returns true 
studentID.containsValue(00000); // returns false
```
- The complexity of .containsValue() is O(1)
- If you use the .put() function using a key that already exists, it overides the old key value pair with that key 
- Since we are on the topic of overiding there is a built in function that does exactly that: .replace()
- Sample use case of .replace(): 
```java
studentID.replace("Alfred",54321); // changes the key "Alfred" value fro 12345 --> 54321
```
- If you do .replace() on a key that doesn't exist then nothing will happen at all 
- In the case you don't know if a key already exists then there is a function for that: putIfAbsent()
- Sample use case of .putIfAbsent(): 
```java
studentID.putIfAbsent("LeBron James", 23); // "LeBron James" does not exist --> added to hashmap
```

## Application of HashMap in LeetCode Style Question 
- Prompt: given two int arrays, determine whether or not the two arrays have an element in common 
- Solution: 
```java
public static boolean itemInCommon(int[] nums1, int[] nums2) {
    // Create a hash map to store all key which is the element and value which is true or false 
    HashMap<Integer,Boolean> hashmap = new HashMap<>(); 

    // This kind of for loop makes it so i = nums[i] at each iteration 
    // Adding each elements in the first array as a key to our hashmap and setting their value to true
    for (int i : nums1) {
        hashmap.put(i,true); 
    }

    // As we iterate through the second array check if a key = current element  exists in our hashmap
    // If a key did exist then .get() would not return null 
    // when the condition is true that means we have found an element in both nums1 and nums2 --> return true
    for (int j: nums2) { 
        if( hashmap.get(j) != null ) return true; 
    }

    // If we iterate both arrays and don't find a commone element we return false
    return false; 
}
// Time Complexity: O(n)
```

## Building Our Own HashMap 
- Create a file called hashmap.java (name can vary)

## Time Complexity of Common Operations with HashMap 
## Java HashMap Operations

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

## Hash Function 
- Hash functions (h) convert each key (k) to an integer in the range of 0 to N-1 where N is the size of the array
- Essentially we are assigning each key to a specific index in the array
- In more mathematical terms we say: h(k) = is an index in our array 
- Hash function can assign multiple keys to the same index and this is called **collision** 
- Hash functions are considered "good" if they can avoid as many collisions as possible 
- A hash function has 2 components: (1) Hash Code --> (2) Compression Function 

# Collision 
- There are multiple ways to handle collisions: (1) Seperate Chaining (2) Linear Probing 
- (1) Seperate Chaining - Creating a linked list at each index and having multiple key value pairs at 1 index
- (2) Linear Probing - If index is already taken then find an empty index to add the key value pair 


