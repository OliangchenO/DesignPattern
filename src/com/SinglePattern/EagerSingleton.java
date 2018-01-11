package com.SinglePattern;
/**
 * 
 * @author Administrator
 * {�Ƿ� Lazy ��ʼ������
�Ƿ���̰߳�ȫ����
ʵ���Ѷȣ���
���������ַ�ʽ�Ƚϳ��ã������ײ�����������
�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
������ classloder ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance ��Ȼû�дﵽ lazy loading ��Ч����}
 */
public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
