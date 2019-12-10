import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame {
    private Group f;
    public static int Width=700;
    public static int Height=700;
    public MyWindow()
    {

        this.setSize(Width,Height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public MyWindow(Group f)
    {
        this();
        this.f = f;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.translate(Width/2,Height/2);
        g.drawLine(-Width/2, 0 ,Width/2, 0);
        g.drawLine(0,-Height/2,0,Height/2);
        g.translate(-Width/2,-Height/2);
        f.draw(g);

    }

}
