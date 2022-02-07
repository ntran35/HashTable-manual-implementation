package getStarting;

public class hello {
	public static void main (String args[]) {
		
		hashTableArray<String> hashTable1 = new hashTableArray<>(10);
		
		Object human = "Jennifer";
		hashTable1.put(5, human);
		hashTable1.put(10, "Janet");
		hashTable1.put(15, "Lily");
		hashTable1.put(20, "Will");
		hashTable1.put(25, "Carnet");
		hashTable1.put(30, "tony");
		
		System.out.print(hashTable1.getValue(25));
		
		
	}
}
