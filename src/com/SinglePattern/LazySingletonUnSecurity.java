package com.SinglePattern;
/**
 * 
 * @author Administrator
 *{ �Ƿ� Lazy ��ʼ������
          �Ƿ���̰߳�ȫ����
	ʵ���Ѷȣ���
	���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
	���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������}
 */
public class LazySingletonUnSecurity {
	private static LazySingletonUnSecurity instance;

	private LazySingletonUnSecurity() {
	}

	public static LazySingletonUnSecurity getInstance() {
		if (instance == null) {
			return new LazySingletonUnSecurity();
		} else {
			return instance;
		}
	}
}
