package Array;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemovesDuplicateElements {
	public static int[] RemoveDuplicates(int array[]) {
		
		HashSet<Integer> set=new HashSet();
		for(int n:array) {
			set.add(n);
		}
		int uniqueArray[]=new int[set.size()];
		int index=0;
		for(int num: set) {
			uniqueArray[index++]=num;
		}
		System.out.println(set);
	return uniqueArray;
		
	}
	public static void main(String[] args) {
		
		int  arr[]= {1,2,3,4,7,9,4,5,3};
		
		int[] array1=RemoveDuplicates(arr);
		System.out.println(Arrays.toString(array1));
	}

}
