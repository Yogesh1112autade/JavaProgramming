package InterviewerCanAsk;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		int first=0;
		int second=1,next;
		for(int i=0;i<=n;i++) {
			System.out.print(first+" ");
			next=first+second;
			first=second;
			second=next;
			
		}
	}

}
