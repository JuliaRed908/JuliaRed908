import java.awt.*;

class ConvexTest {
    static MyWindow w1;
    public static void main(String[] args) throws Exception {


        Convex convex = new Convex();
        w1 = new MyWindow(convex);
        while (true) {
            convex.add(new R2Point());
            System.out.println("S = " + convex.area() + " , P = "
                    + convex.perimeter());
 w1.repaint();
        }


    }
}