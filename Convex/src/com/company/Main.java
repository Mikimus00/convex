package com.company;

public class Main {

    public static void main(String[] args) throws Exception{
        Convex convex = new Convex();
        MyWindow w1 = new MyWindow(convex);
        while (true) {
            convex.add(new R2Point());
            System.out.println("S = " + convex.area() + " , P = "
                    + convex.perimeter());
            w1.repaint();
        }
    }
}
