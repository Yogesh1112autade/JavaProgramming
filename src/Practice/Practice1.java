package Practice;

import java.util.Scanner;

public class Practice1 {
	public static void main(String ags[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
	//	int n=sc.nextInt();
		
		int a;
		for(int i=1;i<1000;i++) {
            int j=i;
			  int sum=0;
		     while(i>0) {
			       a=i%10;    //1
			       sum=sum + a*a*a;
			      i /= 10;
		      }
		   
		if(sum==j) {
			System.out.println(j);
		}
		
		
	}
	}

}
