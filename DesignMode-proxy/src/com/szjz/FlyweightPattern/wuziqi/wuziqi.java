package com.szjz.FlyweightPattern.wuziqi;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class wuziqi
{
    public static void main(String[] args)
    {
        new Chessboard();
    }
}
//����
class Chessboard extends MouseAdapter
{
    WeiqiFactory wf;
    JFrame f;   
    Graphics g;
    JRadioButton wz;
    JRadioButton bz;
    private final int x=50;
    private final int y=50;
    private final int w=40;    //С�����Ⱥ͸߶�
    private final int rw=400;    //���̿�Ⱥ͸߶�
    Chessboard()
    {
        wf=new WeiqiFactory();
        f=new JFrame("��Ԫģʽ����������Ϸ�е�Ӧ��");
        f.setBounds(100,100,500,550);
        f.setVisible(true);       
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel SouthJP=new JPanel();
        f.add("South",SouthJP);
        wz=new JRadioButton("����");
        bz=new JRadioButton("����",true);
        ButtonGroup group=new ButtonGroup();
        group.add(wz);
        group.add(bz);
        SouthJP.add(wz);
        SouthJP.add(bz);      
        JPanel CenterJP=new JPanel();
        CenterJP.setLayout(null);
        CenterJP.setSize(500, 500);
        CenterJP.addMouseListener(this);
        f.add("Center",CenterJP);      
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }               
        g=CenterJP.getGraphics();
        g.setColor(Color.BLUE);   
        g.drawRect(x, y, rw, rw);
        for(int i=1;i<10;i++)
        {
            //���Ƶ�i����ֱ��
            g.drawLine(x+(i*w),y,x+(i*w),y+rw);
            //���Ƶ�i��ˮƽ��
            g.drawLine(x,y+(i*w),x+rw,y+(i*w));
        }   
    }
    public void mouseClicked(MouseEvent e)
    {
        Point pt=new Point(e.getX()-15,e.getY()-15);
        if(wz.isSelected())
        {
            ChessPieces c1=wf.getChessPieces("w");
            c1.DownPieces(g,pt);
        }
        else if(bz.isSelected())
        {
            ChessPieces c2=wf.getChessPieces("b");       
            c2.DownPieces(g,pt);  
        }
    }
}
//������Ԫ��ɫ������
interface ChessPieces
{
    public void DownPieces(Graphics g,Point pt);    //����
}
//������Ԫ��ɫ������
class WhitePieces implements ChessPieces
{
    public void DownPieces(Graphics g,Point pt)
    {       
        g.setColor(Color.WHITE);
        g.fillOval(pt.x,pt.y,30,30);
    }
}
//������Ԫ��ɫ������
class BlackPieces implements ChessPieces
{
    public void DownPieces(Graphics g,Point pt)
    {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}
//��Ԫ������ɫ
class WeiqiFactory
{
    private ArrayList<ChessPieces> qz;   
    public WeiqiFactory()
    {
        qz=new ArrayList<ChessPieces>();
        ChessPieces w=new WhitePieces();
        qz.add(w);
        ChessPieces b=new BlackPieces();
        qz.add(b);
    }   
    public ChessPieces getChessPieces(String type)
    {
        if(type.equalsIgnoreCase("w"))
        {
            return (ChessPieces)qz.get(0);
        }
        else if(type.equalsIgnoreCase("b"))
        {
            return (ChessPieces)qz.get(1);
        }
        else
        {
            return null;
        }
    }
}