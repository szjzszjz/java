package com.szjz.decoratorPattern;

import com.szjz.decoratorPattern.Impl.BlueShapeDecorator;
import com.szjz.decoratorPattern.Impl.Circle;
import com.szjz.decoratorPattern.Impl.Rectangle;
import com.szjz.decoratorPattern.Impl.RedShapeDecorator;
import com.szjz.decoratorPattern.interfaces.Shape;

/**
 * װ����ģʽ��Decorator Pattern��������һ�����еĶ�������µĹ��ܣ�ͬʱ�ֲ��ı���ṹ���������͵����ģʽ���ڽṹ��ģʽ��������Ϊ���е����һ����װ��
 * ����ģʽ������һ��װ���࣬������װԭ�е��࣬���ڱ����෽��ǩ�������Ե�ǰ���£��ṩ�˶���Ĺ��ܡ�
 * ����ͨ�������ʵ������ʾװ����ģʽ���÷������У����ǽ���һ����״װ���ϲ�ͬ����ɫ��ͬʱ�ֲ��ı���״�ࡣ
 * @author ʯ�о���
 *
 *
 *ʹ�� RedShapeDecorator ��װ�� Shape ����
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		/*Circle circle = new Circle();
		
		circle.draw();*/
		
		Shape redShape = new RedShapeDecorator(new Circle());
		redShape.draw();
		
		BlueShapeDecorator blueRectangle = new BlueShapeDecorator(new Rectangle());
		blueRectangle.draw();
	}
}
