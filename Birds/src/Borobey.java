import java.awt.*;
public class Borobey extends Birds {
    protected int x = -300 + (int) (Math.random() * 300);
    protected int y = -300 + (int) (Math.random() * 300);
    protected int size = 20 + (int) (Math.random() * 200);

    public Borobey(){
        System.out.println("Я воробей");
        }




    public void draw(Graphics g) {
        g.setColor(new Color(100,0,100));
        g.fillOval(x, y, size, size);
        g.setColor(new Color(250,200,0));
        g.fillOval(x+size/2, y+size/2, size/4, size/4);

    }}
