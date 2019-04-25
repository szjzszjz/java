package com.szjz.ChainofResponsibilityPattern;

import com.szjz.ChainofResponsibilityPattern.logger.AbstractLogger;
import com.szjz.ChainofResponsibilityPattern.logger.ConsoleLogger;
import com.szjz.ChainofResponsibilityPattern.logger.DebugLogger;
import com.szjz.ChainofResponsibilityPattern.logger.ErrorLogger;

/**
 * 顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。 在这种模式中，通常每个接收者都包含对另一个接收者的引用。
 * 如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 * 
 * @author 石中君子
 *
 *         应用实例： 1、红楼梦中的"击鼓传花"。 2、JS 中的事件冒泡。 3、JAVA WEB 中 Apache Tomcat 对
 *         Encoding 的处理， Struts2 的拦截器， jsp servlet 的 Filter。
 * 
 *         责任链模式有点像 单一树形结构的组合模式
 */
public class ChainofResponsibilityPatternDemo {

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an INFO level information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
//
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level information.");
		
	}

	// 获取责任链 ：  先由错误日志处理  错误日志无法处理-->调试日志无法处理 -->桌面打印日志（最终由打印日志处理）
	public static AbstractLogger getChainOfLoggers() {
		ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO); // 1
		DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG); // 2
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // 3

		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

}
