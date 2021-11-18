
public class Pair<K, V> {
	private K Key;
	private V Value;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}
	public Pair(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
	@Override
	public String toString() {
		return "Pair [Key=" + Key + ", Value=" + Value + "]";
	}
	
}
