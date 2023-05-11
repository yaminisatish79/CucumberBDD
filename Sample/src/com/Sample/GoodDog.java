package com.Sample;
class dog1{
	private String name;
	private String breed;
	private int height;
	private int age;
	
	
	public String getName() {
		return name;
		
		
	}
	
	public void  setName(String dogName) {
		name = dogName;
		//return name;
		
	}
	public int getAge() {
		return age;
	}
	
	public int setAge(int dogAge) {
		if(dogAge<10) {
			System.out.println("young pup");
			return dogAge;
		}
		
		return dogAge;
	}
}

public class GoodDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog1 d= new dog1();
d.setName("fluffy");
System.out.println("the name fo the dog is " +d.getName());
	}

}
