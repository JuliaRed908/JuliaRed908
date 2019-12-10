import java.awt.*;

public class Macaw extends Bird
{
    public String name = "Кеша";
    private static int count = 0;
    public Macaw()
    {
        System.out.println("Я попугай");
        vid = "Попугай";
        count++;

        this.time();
        this.color = new Color(255,10,65);
    }
    public Macaw(String str)
    {
        name = str;
        System.out.println("Я попугай");
        count++;


    }
    public void speak()
    {
        System.out.println("Меня зовут " + name);
    }
    public void setName(String c) {
        this.name = c;
    }  public String getName()
{
    return this.name;
}
    public void dialog(Bird a)
    {
        if(a.vid == "Попугай")
        {
            System.out.println("Попугай говорит с попугаем");
        }
        else if (a.vid == "Пингвин")
        {
            System.out.println("Попугай не говорит с пингвином");
        }

    }
    public void Count()
    {
        System.out.println(count);
    }
}
