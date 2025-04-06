package exam2_hashmap;

public class OpenAddressHashMap<K,V> {
    int capacity = 101; 
    Pair<K,V>[] bucket; 
    int size; 

    public OpenAddressHashMap() {
        bucket = new Pair[capacity]; 
        size = 0; 
    }

    public int hashfunction(K key) {
        int hash = 0; 
        char[] keyChars = key.toString().toCharArray(); 
        
        for(int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; 
            hash = (hash + asciiValue * 23) % capacity; 
        }

        return hash; 
    }

    public void put(Pair<K,V> pair) {

    }

    public Pair<K,V> get(K key) {

    }

    public Pair<K,V> remove(K key) {

    }

    public LinkedList<K> keySet() {

    }

    public LinkedList<Pair<K,V>> entrySet() {

    }    
}
