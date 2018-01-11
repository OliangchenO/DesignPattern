package com.simpleFactoryPattern;

public class Gardener {
	
//	public static Fruit getFruit(String fruitPath) throws Exception {
//		Class<?> c = Class.forName(fruitPath);
//		return (Fruit) c.newInstance();
//	}
	
	public static Object getClass(Class<? extends Fruit> c){
		Object obj = null;
		try {
			obj = Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
		
	}
	
	public static void main(String[] args) {
		try {
			Fruit fruit0 = (Fruit) Gardener.getClass(Apple.class);
			fruit0.grow();
			Fruit fruit1 = (Fruit) Gardener.getClass(Grape.class);
			fruit1.grow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
