package com.Sample;

class sample{
	String colorName;
	
	void display(String name)
	{
		System.out.println("the color name is " +name);
	}
	int sum(int a,int b) {
		int c=a+b;
		return c;
	}
}

public class ParameterPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sample s=new sample();
s.display("red");
int answer = s.sum(12,13);
System.out.println("the sum of the two number is " +answer);
	}

}
