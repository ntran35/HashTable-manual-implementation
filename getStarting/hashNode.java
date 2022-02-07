package getStarting;

public class hashNode {
	int key;
	Object value;
	hashNode next;
	
	public hashNode (int key, Object value) {
		this.key = key;
		this.value = value;
		next = null;
	}
	
	public hashNode() {
		//initialize (default constructor)
		next = null;
	}
	
	public int getKey () {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	
}
