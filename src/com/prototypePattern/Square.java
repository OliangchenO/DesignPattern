package com.prototypePattern;

public class Square extends Shape {
	public Square(){
		type = "Square";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square draw()");
	}
}
