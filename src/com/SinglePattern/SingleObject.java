package com.SinglePattern;

public class SingleObject {
	// ���� SingleObject ��һ������
	private static SingleObject instance = new SingleObject();

	// �ù��캯��Ϊ private����������Ͳ��ᱻʵ����
	private SingleObject() {
	}

	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("SingleObject created!");
	}
}
