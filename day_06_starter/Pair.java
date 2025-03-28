package day_06_starter;

public class Pair <K,V> {
		K key;
		V value;
		
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() { return this.key; }
		public V getValue() { return this.value; }
		
		public void setKey(K k) { this.key = k; }
		public void setValue(V v) { this.value = v; }
		
		public boolean equals(Object o) {
			try {
				Pair<K, V> pair = (Pair<K, V>) o;
			return this.key == pair.getKey() 
					&& this.value == pair.getValue();
		} catch(ClassCastException e) {
			return false;
		}
	}
}