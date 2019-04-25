package com.szjz.ChainofResponsibilityPattern.logger;

/**
 * 抽象日之类
 * @author 石中君子
 *
 */
public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	//责任链中的下一个元素
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level ,String message) {
		//级别越小管理的范围越广 
		if (this.level <= level) {
			System.out.println("this.level:" + this.level + "  level:"+level);
			write(message);
			System.out.println("------------------------------");
		}
		
		//如果有下一个响应链节点，继续调用该方法，直到找到处理该日志的节点
		else if (nextLogger != null) {
			System.out.println("下一个日志：" + nextLogger.getClass().getSimpleName());
			nextLogger.logMessage(level, message);
		}
	}
	
	protected abstract void write(String message);
}

