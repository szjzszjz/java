package com.szjz.FlyweightPattern;

/**
 * ����Ԫ��ɫ
 * @author ʯ�о���
 *
 */
public class UnsharedConcreteFlyweight {

	private String info;
	
    public UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }
    
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}
