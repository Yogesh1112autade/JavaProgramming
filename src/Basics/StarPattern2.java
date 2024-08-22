package Basics;
//Simple Half Left Pyramid
public class StarPattern2 {
	public static void main(String args[]) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;i++)
			{
				System.out.print("* ");
			}
			  System.out.println("");
		}
	}

}
