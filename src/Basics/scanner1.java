package Basics;
import java.util.*;
public class scanner1
{
	public void Empdetails() 
	{
		Scanner sc=new Scanner(System.in);
		String name;
		Double sal;
		int age;
		System.out.println("Enter a name:");
		name=sc.nextLine();
		System.out.println("Enter a salary:");
		sal=sc.nextDouble();
		System.out.println("Enter a age:");
		age=sc.nextInt();
		System.out.println("Name is:"+name);
		System.out.println("Sal is:"+sal);
		System.out.println("age is:"+age);
		sc.close();
	}
	public static void main(String args[]) {
		scanner1 obj=new scanner1();
		obj.Empdetails();
		}

}
