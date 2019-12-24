package com.company;
import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame{
    Convex c = new Convex();
    public MyWindow()
    {
        this.setSize(1000,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public MyWindow(Convex c)
    {
        this();
        this.c = c;
    }
    @Override
    public void paint(Graphics g)
    {
        g.translate(getWidth()/2,getHeight()/2);
//        g.setColor(new Color(255,0,0));
        g.drawLine(-getWidth()/2, 0 ,getWidth()/2, 0);
        g.drawLine(0, -getHeight()/2 ,0, getHeight()/2);
//        g.drawOval(50,50,20,20);
//        g.fillOval(100,100,30,30);

        c.draw(g);
    }
}
