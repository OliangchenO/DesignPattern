package com.abstractFactoryPattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory = FactoryProducer.getFactory(SharpFactory.class);
		Circle circle = (Circle) shapeFactory.getSharp(Circle.class);
		circle.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
		Color red = colorFactory.getColor(Red.class);
		red.fill();
	}

}
