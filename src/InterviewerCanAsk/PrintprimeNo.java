package InterviewerCanAsk;

import java.util.Scanner;

public class PrintprimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
				if(c==2) {
					System.out.print(i+" ");
				}
			
		}
		
	}

}
