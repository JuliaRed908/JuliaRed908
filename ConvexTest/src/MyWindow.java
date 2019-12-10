import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame {
    public Convex f;
    public static int Width = 800;
    public static int Height = 800;

    public MyWindow()
    {
        this.setSize(Width,Height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public MyWindow(Convex convex)
    {
        this();
        this.f=convex;
    }

    public void paint(Graphics g)
    {
        //super.paint(g);
        g.translate(Width/2,Height/2);
        g.drawLine(-Width/2, 0 ,Width/2, 0);
        g.drawLine(0,-Height/2,0,Height/2);

        g.drawLine(50, -50 ,50, -0);
        g.drawLine(50, -50 ,0, -50);
       // g.translate(-getWidth()/2,-getHeight()/2);
        f.draw(g);
    }

}
