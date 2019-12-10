import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.Graphics;

class Convex {
    private Figure fig;



    public Convex() {
        fig = new Void();
    }
    public void add(R2Point p) {
        fig = fig.add(p);
    }
    public double area() {
        return fig.area();
    }
    public double perimeter() {
        return fig.perimeter();
    }
    public void draw(Graphics g) {
         fig.draw(g);
    }




}