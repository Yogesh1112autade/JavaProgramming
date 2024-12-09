package InterviewerCanAsk;

import java.util.Arrays;

public class PassArumentAsArrayReverseIt {

	public static String [] ReverseArray(String array[]) {
		String[] ar=new String[array.length];
		for(int i=0,k=array.length-1;i<array.length;i++,k--) {
			ar[k]=array[i];
		}
		
		return ar;
	}
	public static void main(String[] args) {
		
		String[] arr= {"Yogesh","Asha","Vikas","Manisha"};
		String RevArray[]=ReverseArray(arr);
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Reverse Array:"+Arrays.toString(RevArray));
	}
}
