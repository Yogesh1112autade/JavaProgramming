package Array;

import java.util.Arrays;

public class CopyArrayAndReverse {
	public static void main(String[] args) {
		
		int arr[]= { 1,2,3,4,5};
		int arr2[]=new int[5];
		System.out.println(Arrays.toString(arr));
		for(int i=0,k=arr.length-1;i<arr.length;i++,k--) {
			arr2[k]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
