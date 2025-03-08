package Array;

public class FindSecondLargestElement {
	 
   public static void main(String[] args) {
	int arr[]= {2332,532,34,746,323};
	
	int max=0;
	int secondmax=0;
	for(int num:arr) {
		if(num > max){
		secondmax=max;
			max=num;
		}
	}
	
	System.out.println("max:"+max);
	System.out.println("second max:"+secondmax);
  }
}
