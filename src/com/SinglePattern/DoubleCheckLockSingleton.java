package com.SinglePattern;

/**
 * 
 * @author Administrator {JDK �汾��JDK1.5 �� �Ƿ� Lazy ��ʼ������ �Ƿ���̰߳�ȫ���� ʵ���Ѷȣ��ϸ���
 *         ���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ� getInstance() �����ܶ�Ӧ�ó���ܹؼ���}
 */
public class DoubleCheckLockSingleton {
	private volatile static DoubleCheckLockSingleton instance;

	private DoubleCheckLockSingleton() {
	}

	public static DoubleCheckLockSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLockSingleton.class) {
				instance = new DoubleCheckLockSingleton();
			}
		}
		return instance;
	}
}
