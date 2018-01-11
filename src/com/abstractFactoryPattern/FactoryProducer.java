package com.abstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(Class<? extends AbstractFactory> c){
		AbstractFactory obj = null;
		try {
			obj = (AbstractFactory) Class.forName(c.getName()).newInstance();
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
		return obj;
	}
}
