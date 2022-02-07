package getStarting;

public class hashTableArray<T> {
	
	hashNode[] arrayHash;
	int size;
	
	public hashTableArray(int size) {
		//constructor
		this.size = size;
		arrayHash = new hashNode[size];
		
		for (int i = 0; i<size; i++) {
			arrayHash[i] = new hashNode();
		}
	}
	
	//create function for hashing the key
	int getHash(int key) {
		return key%size;
	}
	
	//create function to PUT
	public void put (int key, Object value) {
		int HashIndex = getHash (key);
		
		hashNode ArrayValue = arrayHash[HashIndex];
		hashNode newNodeItem = new hashNode(key, value);
		
		newNodeItem.next = ArrayValue.next;
		ArrayValue.next = newNodeItem;
		
	}
	
	//get value method using the key in parameter
	public T getValue (int key) {
		T value = null;
		
		int HashIndex = getHash(key);
		hashNode arrayValue = arrayHash[HashIndex];
		
		System.out.println("hashvalue is: " + HashIndex);
		
		while (arrayValue != null) {
			if (arrayValue.getKey() == key) {
				value = (T) arrayValue.getValue();
				break;
			}
			arrayValue = arrayValue.next;
		}
		
		
		return value;
	}
	
	
}
