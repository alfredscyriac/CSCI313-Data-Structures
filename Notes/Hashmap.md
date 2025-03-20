# Hashmaps 

## Basic Concept 
- Hashmaps are also referred to as hash tables
- Essentially it is an array that holds key value pairs at each index 
- Think of a key value pair as the correlation between a student ID to a student's name

## Java Hashmaps
- To use the built-in Java hasmaps first you have to import it 
```java 
import java.util.HashMap
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
studentID.putIfAbsent("LeBron James", 23); // Since the key "LeBron James" does not exist it adds this key value pair to the hasmap
```
- 

## Hash Function 
- Hash functions (h) convert each key (k) to an integer in the range of 0 to N-1 where N is the size of the array
- Essentially we are assigning each key to a specific index in the array
- In more mathematical terms we say: h(k) = is an index in our array 
- Hash function can assign multiple keys to the same index and this is called **collision** 
- Hash functions are considered "good" if they can avoid as many collisions as possible 
- A hash function has 2 components: (1) Hash Code --> (2) Compression Function 

## Hash Code 
- Intially the hash function takes a key (k) and computes an integer which called the **hash code**
- The integer that is the hash code does NOT have to be in the range 0 to N-1 and can even be negative

## Compression Function 
- The compression function is the second operation run by the hash function 
- The compression function ensures the integer that is the hash code is in range 0 to N-1


## Key Characteristics 
- **Average Time Complexity**: O(1) for search, insert, and delete 
- **Worst Case Time Complexity**: O(n) when collisions occur 
