package com.codegnan.oopexamples;

public class OverloadDemo {
	public void test() {
		System.out.println("No parameters");
	}
	public void test(int a) {
		System.out.println("a value is "+a);
	}
	public void test(int a,int b) {
		int c=a+b;
		System.out.println("Sum of A and B is "+c);
	}
	public double test(double d) {
		return d*d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo demo=new OverloadDemo();
		demo.test();
		demo.test(10);
		demo.test(10,20);
		System.out.println("Square is "+demo.test(2.0));
	}

}
