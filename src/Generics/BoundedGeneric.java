package Generics;

public class BoundedGeneric {


		public static void main(String[] args) {
			//printdata("Yogesh");  It not support bz of if only number
			printdata(12);
		}
		
		static<T extends Number> void printdata(T name) {
			System.out.println(name);
		}

	

}
