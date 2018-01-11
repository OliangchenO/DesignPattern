package com.SinglePattern;
/**
 * 
 * @author Administrator
 * {�Ƿ� Lazy ��ʼ������
�Ƿ���̰߳�ȫ����
ʵ���Ѷȣ�һ��
���������ַ�ʽ�ܴﵽ˫������ʽһ���Ĺ�Ч����ʵ�ָ��򵥡��Ծ�̬��ʹ���ӳٳ�ʼ����Ӧʹ�����ַ�ʽ������˫������ʽ�����ַ�ʽֻ�����ھ�̬��������˫������ʽ����ʵ������Ҫ�ӳٳ�ʼ��ʱʹ�á�
���ַ�ʽͬ�������� classloder ��������֤��ʼ�� instance ʱֻ��һ���̣߳������� 3 �ַ�ʽ��ͬ���ǣ��� 3 �ַ�ʽֻҪ Singleton �౻װ���ˣ���ô instance �ͻᱻʵ������û�дﵽ lazy loading Ч�����������ַ�ʽ�� Singleton �౻װ���ˣ�instance ��һ������ʼ������Ϊ SingletonHolder ��û�б�����ʹ�ã�ֻ��ͨ����ʽ���� getInstance ����ʱ���Ż���ʽװ�� SingletonHolder �࣬�Ӷ�ʵ���� instance������һ�£����ʵ���� instance ��������Դ�������������ӳټ��أ�����һ���棬�ֲ�ϣ���� Singleton �����ʱ��ʵ��������Ϊ����ȷ�� Singleton �໹�����������ĵط�������ʹ�ôӶ������أ���ô���ʱ��ʵ���� instance ��Ȼ�ǲ����ʵġ����ʱ�����ַ�ʽ��ȵ� 3 �ַ�ʽ���Եúܺ���}
 */
public class StaticInnerClassSingleton {
	private static class StaticInnerClassSingletonHolder{
		private static final StaticInnerClassSingleton Instance = new StaticInnerClassSingleton(); 
	}
	
	private StaticInnerClassSingleton(){}
	
	public static final StaticInnerClassSingleton getInstance(){
		return StaticInnerClassSingletonHolder.Instance;
	}
}
