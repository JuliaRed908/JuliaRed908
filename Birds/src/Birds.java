import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.Object;
import java.text.Collator;
public abstract class Birds {
    protected int a = 0;
    protected int b = 900;
    protected int x = a+ (int)(Math.random()*b);
    protected int y = a+ (int)(Math.random()*(b));
    protected int size = 50;
    protected Color color = Color.BLUE;

    /*private static  int numi=0;
    public Birds() {
       // System.out.println("Я птица");
       // numi=numi+1;

    }*/

    public String vid;
    protected Calendar cal1 = new GregorianCalendar();
    protected Date date = new Date();
    SimpleDateFormat format1;





    public void time() {
        format1 = new SimpleDateFormat("HH:mm");
        System.out.println(format1.format(date));
        int hour = cal1.get(Calendar.HOUR_OF_DAY);
        if(hour>6 && hour <10){System.out.println("Утро");}
        else if(hour >=10 && hour <=16){System.out.println("День");}
        else if(hour >16 && hour <=23){System.out.println("Вечер");}
        else if(hour <23 && hour <=6){System.out.println("Ночь");}
    }




    public void Fly() {
        System.out.println("Я лечу");
    }

    /* public void nummi()
     {
         System.out.println(numi);
     }*/
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, size, size);

    }
}