package com.company;
import java.awt.*;
import javax.swing.*;
public class Segment implements Figure {
    private R2Point p, q;
    public Segment(R2Point p, R2Point q) {
        this.p = p; this.q = q;
    }
    public double perimeter() {
        return 2.0 * R2Point.dist(p, q);
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point r) {
        if (R2Point.isTriangle(p, q, r))
            return new Polygon(p, q, r);
        if (q.inside(p, r)) q = r;
        if (p.inside(r, q)) p = r;
        return this;
    }
    public void draw(Graphics g){
    g.drawLine((int)p.x,-(int)p.y,(int)q.x,(int)q.y);
        g.fillOval((int)p.x,-(int)p.y,2,2);
    }
}
