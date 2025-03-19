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
HashMap<keyDataType,valueDataType> hashmapName = new Hashmap<>();
``` 

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
