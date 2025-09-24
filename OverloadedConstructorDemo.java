package com.codegnan.oopexamples;

public class OverloadedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1=new Box();
		Box mybox2=new Box(5);
		Box mybox3=new Box(10,3,4);
		System.out.println("Box 1 Volume is : "+mybox1.volume());
		System.out.println("Box 1 Volume is : "+mybox2.volume());
		System.out.println("Box 1 Volume is : "+mybox3.volume());
	}

}
