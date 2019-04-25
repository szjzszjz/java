package com.szjz.singletonPattern;

/**
 * 单利模式
 * 
 * @author admin
 *
 */
public class SingleObject {

	// 私有化构造函�? 防止外界通过new 创�??
	/*
	 * private SingleObject() { };
	 * 
	 * public static SingleObject instance;
	 */
	// 懒汉�? 线程不安�?
	/*
	 * public static SingleObject getInstance() { if (instance == null) { instance =
	 * new SingleObject(); } return instance; }
	 */

	// 懒汉�? 线程安全
	/*
	 * public static synchronized SingleObject getInstance() { if (instance == null)
	 * { instance = new SingleObject(); } return instance; }
	 */

	/*
	 * 饿汉�? 类加载时就初始化，浪费内存�?? instance 在类装载时就实例�? private static Singleton instance = new
	 * Singleton(); private Singleton (){} public static Singleton getInstance() {
	 * return instance; }
	 */

	// 懒加载：双检�?/双重校验�? 线程安全 性能�? 和解决Redis高并发缓存击穿的情况�?�?
	/*
	 * public static SingleObject getInstance() { if (instance == null) {
	 * //保证后续高并发的情况下不在进行同�? synchronized (SingleObject.class) {
	 * //保证第一批高并发的情况下只有�?个实例创�? if (instance == null) { instance = new SingleObject();
	 * } } } return instance; }
	 */

	//懒加载：登记�?/静�?�内部类 内部类和静�?�内部类都是延时加载的，也就是说只有在明确用到内部类时才加载。只使用外部类时不加载�??
	private static class SingleHolder {
		private static final SingleObject instance = new SingleObject();
	}
	
	private SingleObject() {
	}

	public static SingleObject getInstance() {
		return SingleHolder.instance;
	}

	public void showMassage() {
		System.out.println("hello");
	}
	

}
