package InterviewerCanAsk;

import java.util.Scanner;

public class FindOddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" no is Even");
		}else {
			System.out.println(n+" no is odd");
		}
	}

}
