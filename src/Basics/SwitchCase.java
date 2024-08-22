package Basics;

import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,sum,sub,mul;
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		
		int choice;
		System.out.println("1.addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		
		System.out.println("Enter your Choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:sum=a+b;
			System.out.println("Sum:"+sum);
			break;
			
			case 2:sub=a-b;
			System.out.println("Sub:"+sub);
			break;
			
			case 3:mul=a*b;
			System.out.println("mul:"+mul);
			break;
			
			default:System.out.println("default value");
			
		}
	
	
		
	}

	

}
