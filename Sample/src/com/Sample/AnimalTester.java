package com.Sample;

class Dog{
	String dogName;
	String dogType;
	
	void bark() {
		System.out.println("hi my name is" +dogName+ "woof woof");
		
	}
}

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog[] d=new Dog[3];
d[0] = new Dog();
d[1] = new Dog();
d[2] = new Dog();

d[0].dogName = "nimi";
d[1].dogName = "mikey";
d[2].dogName = "sunny";

d[0].bark();
d[1].bark();
d[2].bark();	
}

}
