package com.prototypePattern;

import java.util.Hashtable;

/**
 * 
 * @author Administrator {����һ���࣬�����ݿ��ȡʵ���࣬�������Ǵ洢��һ�� Hashtable �С�}
 */
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape;
	}

	// ��ÿ����״���������ݿ��ѯ������������״
	// shapeMap.put(shapeKey, shape);
	// ���磬����Ҫ���������״
	public static void loadCache() {
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
