package com.abstractFactoryPattern;

public abstract class AbstractFactory {
	abstract Sharp getSharp(Class<? extends Sharp> c);
	abstract Color getColor(Class<? extends Color> c);
}
