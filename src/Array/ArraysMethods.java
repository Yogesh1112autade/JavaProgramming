package Array;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
		int num[]= {5,8,6,4,3};
		// sort the array
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//copy Array
		 int arr1[]=Arrays.copyOf(num,num.length);
		 System.out.println(Arrays.toString(arr1));
		
	}

}
