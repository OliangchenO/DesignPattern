package com.SinglePattern;
/**
 * 
 * @author Administrator
 * {@link http://www.runoob.com/design-pattern/singleton-pattern.html}
 * {����̸֮��һ������£�������ʹ�õ� 1 �ֺ͵� 2 ��������ʽ������ʹ�õ� 3 �ֶ�����ʽ��ֻ����Ҫ��ȷʵ�� lazy loading Ч��ʱ���Ż�ʹ�õ� 5 �ֵǼǷ�ʽ������漰�������л���������ʱ�����Գ���ʹ�õ� 6 ��ö�ٷ�ʽ�������������������󣬿��Կ���ʹ�õ� 4 ��˫������ʽ��}
 */
public class SinglePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ϸ��Ĺ��캯��
		// ����ʱ���󣺹��캯�� SingleObject() �ǲ��ɼ���
		// SingleObject object = new SingleObject();

		// ��ȡΨһ���õĶ���
		SingleObject singleO = SingleObject.getInstance();
		singleO.showMessage();
		
		EnumSingleton.INSTANCE.whateverMethod();
	}

}
