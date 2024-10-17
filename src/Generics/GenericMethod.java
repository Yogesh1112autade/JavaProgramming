package Generics;

public class GenericMethod {
	public static void main(String[] args) {
		printdata("Yogesh");
		printdata(12);
	}
	
	static<T> void printdata(T name) {
		System.out.println(name);
	}

}
