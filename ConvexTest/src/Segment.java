import java.awt.*;
import java.awt.geom.Line2D;

class Segment implements Figure {
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

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        for (int i = 0; i <2; i++) {
            R2Point R1 = p;
            R2Point R2 = q;
           // g.fillOval((int)R1.x, (int)-R1.y, 5,5);
           // g.fillOval((int)R1.x, (int)-R2.y, 5,5);
            Shape l = new Line2D.Double(R1.x,-R1.y,R2.x,-R2.y);
            g2.draw(l);

        }
        return;
    }
}