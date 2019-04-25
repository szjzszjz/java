package com.szjz.ChainofResponsibilityPattern;

import com.szjz.ChainofResponsibilityPattern.logger.AbstractLogger;
import com.szjz.ChainofResponsibilityPattern.logger.ConsoleLogger;
import com.szjz.ChainofResponsibilityPattern.logger.DebugLogger;
import com.szjz.ChainofResponsibilityPattern.logger.ErrorLogger;

/**
 * ����˼�壬������ģʽ��Chain of Responsibility Pattern��Ϊ���󴴽���һ�������߶��������
 * ����ģʽ������������ͣ�������ķ����ߺͽ����߽��н���������͵����ģʽ������Ϊ��ģʽ�� ������ģʽ�У�ͨ��ÿ�������߶���������һ�������ߵ����á�
 * ���һ�������ܴ����������ô�������ͬ�����󴫸���һ�������ߣ��������ơ�
 * 
 * @author ʯ�о���
 *
 *         Ӧ��ʵ���� 1����¥���е�"���Ĵ���"�� 2��JS �е��¼�ð�ݡ� 3��JAVA WEB �� Apache Tomcat ��
 *         Encoding �Ĵ��� Struts2 ���������� jsp servlet �� Filter��
 * 
 *         ������ģʽ�е��� ��һ���νṹ�����ģʽ
 */
public class ChainofResponsibilityPatternDemo {

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an INFO level information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
//
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level information.");
		
	}

	// ��ȡ������ ��  ���ɴ�����־����  ������־�޷�����-->������־�޷����� -->�����ӡ��־�������ɴ�ӡ��־����
	public static AbstractLogger getChainOfLoggers() {
		ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO); // 1
		DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG); // 2
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // 3

		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

}
