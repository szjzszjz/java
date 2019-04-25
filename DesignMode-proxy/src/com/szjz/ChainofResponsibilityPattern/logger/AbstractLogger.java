package com.szjz.ChainofResponsibilityPattern.logger;

/**
 * ������֮��
 * @author ʯ�о���
 *
 */
public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	//�������е���һ��Ԫ��
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level ,String message) {
		//����ԽС����ķ�ΧԽ�� 
		if (this.level <= level) {
			System.out.println("this.level:" + this.level + "  level:"+level);
			write(message);
			System.out.println("------------------------------");
		}
		
		//�������һ����Ӧ���ڵ㣬�������ø÷�����ֱ���ҵ��������־�Ľڵ�
		else if (nextLogger != null) {
			System.out.println("��һ����־��" + nextLogger.getClass().getSimpleName());
			nextLogger.logMessage(level, message);
		}
	}
	
	protected abstract void write(String message);
}

