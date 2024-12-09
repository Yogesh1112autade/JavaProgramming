package JavaCollectionFramework;

import java.util.HashSet;

public class HashSetMethods1 {
	
	    public static void main(String[] args) {
	        // Create a HashSet of integers
	        HashSet<Integer> numbers = new HashSet<>();

	        // Add elements to the HashSet
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);

	        // Try adding duplicate elements
	        numbers.add(3); // This will not be added

	        // Print the HashSet
	        System.out.println(numbers); // Output could be: [1, 2, 3, 4]

	        // Check if an element exists in the set
	        System.out.println(numbers.contains(3)); // Output: true

	        // Remove an element
	        numbers.remove(2);

	        // Print the HashSet after removal
	        System.out.println(numbers); // Output could be: [1, 3, 4]
	    }
	


}
