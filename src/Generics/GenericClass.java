package Generics;

import ExceptionHandling.Main;

public class GenericClass {
	public static void main(String[] args) {
		Dog<String> d1=new Dog<>("Yogesh");
		Dog<String> d2=new Dog<>("Autade");
		Dog<Integer> d3=new Dog<>(123);
		System.out.println(d3.Getid());
	}
}
class Dog<E>{
	E id;
	public Dog(E id) {
		this.id=id;
	}
	E Getid() {
		return id;
	}
}
