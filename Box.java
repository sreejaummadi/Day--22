package com.codegnan.oopexamples;

public class Box {
	double height;
	double width;
	double depth;
	
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	//overloaded constructors
	public Box() {
		width=-1;
		depth=-1;
		height=-1;
	}
	public Box(double len) {
		width=height=depth=len;
	}
	public double volume() {
		return width*height*depth;
	}
}

