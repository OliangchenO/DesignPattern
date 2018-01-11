package com.strategyPattern;
/**
 * 
 * @author Administrator
 * {@link http://www.runoob.com/design-pattern/strategy-pattern.html}
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Strategy add = new OperationAdd();
		Context context = new Context(add);
		System.out.println(context.executeStrategy(3, 5));
		Strategy substract = new OperationSubstract();
		context = new Context(substract);
		System.out.println(context.executeStrategy(3, 5));
	}
}
