
import javax.swing.*;
        import java.awt.*;

        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Calendar;
        import java.util.GregorianCalendar;

public class Bird {

    public void Fly()
    {
        System.out.println("Я лечу");
    }


    public String vid;
    protected Calendar cal1 = new GregorianCalendar();
    protected Date date = new Date();
    SimpleDateFormat format1;
    private int width = MyWindow.Width;
    private int height = MyWindow.Height;
    protected int y =  (int)(Math.random()*(height-height/10));
    protected int x = (int)(Math.random()*(width-width/10));
    public int size = 50;
    public Color color = Color.BLUE;


    public void draw(Graphics g)
    {g.setColor(color);
        g.fillOval(x,y,size,size);
    }
    public void time() {
        format1 = new SimpleDateFormat("HH:mm");
        System.out.println(format1.format(date));
        int hour = cal1.get(Calendar.HOUR_OF_DAY);
        if(hour>6 && hour <10){System.out.println("Утро");}
        else if(hour >=10 && hour <=16){System.out.println("День");}
        else if(hour >16 && hour <=23){System.out.println("Вечер");}
        else if(hour <23 && hour <=6){System.out.println("Ночь");}
    }


}
