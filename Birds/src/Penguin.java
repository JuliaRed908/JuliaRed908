import java.awt.*;

public class Penguin extends Bird {

    public Penguin()
    {
        System.out.println("Я пингвин");
        vid = "Пингвин";

        this.time();
        this.color = Color.BLACK; //черный цвет
        this.size = 60;
    }
    @Override
    public void Fly()
    {
        System.out.println("Я не могу летать");
    }
    public void draw (Graphics g)
    {
        super.draw(g);


        g.setColor(color);
        g.fillOval(this.x,this.y,this.size,this.size);
        g.setColor(new Color(255,100,255));
        g.fillOval(this.x+2, this.y+3,this.size/2,this.size/2);
        g.setColor(color);


    }

}