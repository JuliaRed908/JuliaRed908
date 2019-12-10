import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
//        Bird a = new Bird();
//        Macaw b = new Macaw();
//        Macaw c = new Macaw("Конфетка");
//        Penguin d = new Penguin();
//        a.Bird();
//        a.Fly();
//        b.Fly();
//        b.setName("Гоша");
//        b.speak();
//        System.out.println(b.getName());
//        c.speak();
//        d.Fly();
//        b.dialog(d);
//        b.Count();
//        a.Numb();
//        Macaw m1 = new Macaw("Гоша");
//        Macaw m2 = new Macaw("Кеша");
//        m1=m2;
//        m2.setName("Петя");
//        m1.speak();

//
//        Bird[] parrot =new Bird[3];
//        parrot[0] = new Macaw("Кеша");
//        parrot[1] = new Macaw("Гоша");
//        parrot[2] = new Penguin();
//        for(int i = 0; i< parrot.length; i++) {
//            parrot[i].Fly();
//            if (i == 1)
//            {((Macaw) parrot[i]).speak();}
//        }
//

//        ArrayList<Bird> par = new ArrayList<>();
//        par.add(new Macaw("Кеша"));
//        par.add(new Macaw("Гоша"));
//        par.add(new Penguin());
//        for(int i = 0; i < par.size(); i++)
//        {
//            (par.get(i)).Fly();
//        }


//        Company C = new Company();
//        C.Count();
//        C.Fly();
//        C.Names();

        //создание диалога
//        JFrame w = new JFrame("Мое окно");
//        w.setVisible(true);
//        w.setSize(200,400);
//        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Group c1 = new Group();
        MyWindow w1 = new MyWindow(c1);
    }
}