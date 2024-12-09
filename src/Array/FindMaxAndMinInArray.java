package Array;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		
		int[] array= {23,56,11,44,89,67};
		
		int min=array[0];
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
			
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("minimum no is:"+min);
		System.out.println("max  no is:"+max);

	}
	
	
}
