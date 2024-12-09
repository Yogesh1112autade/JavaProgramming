package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraysToArrayList {
	public static void main(String[] args) {
		
		String arr[]= {"Yogesh","asha","Manisha"};
		// print array
		System.out.println("Print array values:");
		System.out.println(Arrays.toString(arr));
		
		//convert arrays to arraylist
		System.out.println("Print ArrayList:");
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
