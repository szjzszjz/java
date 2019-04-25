package com.szjz.bridgePatter.interfaces;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * @author 石中君子
 *
 */
public abstract class Shape {
  protected DrawAPI drawApi;
  
  protected Shape(DrawAPI drawApi) {
	  this.drawApi = drawApi;
  }
  
  public abstract void draw();
  
}
