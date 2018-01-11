package com.SinglePattern;

/**
 * 
 * @author Administrator 
 * �Ƿ� Lazy ��ʼ������ 
 * �Ƿ���̰߳�ȫ���� 
 * ʵ���Ѷȣ��� 
 * ���������ַ�ʽ�߱��ܺõ� lazy
 *       loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ���� �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
 *       ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ� getInstance()
 *       �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
 */
public class LazySingletonSecurity {

	private static LazySingletonSecurity instance;

	private LazySingletonSecurity() {
	}

	public static synchronized LazySingletonSecurity getInstance() {
		if (instance == null) {
			instance = new LazySingletonSecurity();
		}
		return instance;
	}
}
