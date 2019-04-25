package com.szjz.bridgePatter.interfaces;

/**
 * ʹ�� DrawAPI �ӿڴ��������� Shape��
 * @author ʯ�о���
 *
 */
public abstract class Shape {
  protected DrawAPI drawApi;
  
  protected Shape(DrawAPI drawApi) {
	  this.drawApi = drawApi;
  }
  
  public abstract void draw();
  
}
