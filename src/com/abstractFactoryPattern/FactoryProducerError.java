package com.abstractFactoryPattern;

public class FactoryProducerError extends AbstractFactory {
	//这样还是有耦合感觉属于简单工厂模式
	@Override
	Sharp getSharp(Class<? extends Sharp> c) {
		// TODO Auto-generated method stub
		Sharp sharp = null;
		try {
			sharp = (Sharp) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sharp;
	}

	@Override
	Color getColor(Class<? extends Color> c) {
		// TODO Auto-generated method stub
		Color color = null;
		try {
			color = (Color) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return color;
	}

}
