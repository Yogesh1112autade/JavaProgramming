package Array;

import java.util.Arrays;

public class IntegerReverseArrayAndReturnIt {

	public static int [] ReverseArray(int array[]) {
		int[] ar=new int[array.length];
		for(int i=0,k=array.length-1;i<array.length;i++,k--) {
			ar[k]=array[i];
		}
		
		return ar;
	}
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int RevArray[]=ReverseArray(arr);
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Reverse Array:"+Arrays.toString(RevArray));
	}

}
