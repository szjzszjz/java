package com.szjz.facadePattern;

import com.szjz.facadePattern.facade.Computer;

/**
 * 松散耦合，外观模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
 * 简单易用，外观模式让子系统更加易用，客户端不再需要了解子系统内部的实现，
 * 也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
 * 更好的划分访问层次-通过合理使用 Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。
 * 把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
 * @author 石中君子
 *
 *
 *假设一台电脑，它包含了 CPU（处理器），Memory（内存） ，Disk（硬盘）这几个部件，若想要启动电脑，则先后必须启动 CPU、Memory、Disk。关闭也是如此。
 *但是实际上我们在电脑开/关机时根本不需要去操作这些组件，因为电脑已经帮我们都处理好了，并隐藏了这些东西。
 *这些组件好比子系统角色，而电脑就是一个外观角色。
 *
 *通过一个类对内部细节进行封装处理， 在外部直接调用这个类，对该类进行操作
 */
public class FacadePatternDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Computer computer = new Computer();
		computer.startup();
		Thread.sleep(3000);
		System.out.println("--------------");
		computer.shutdown();
	}

}
