import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    private int count = 0;
    private ArrayList<Bird> birds;
    private int count1=-1;
    private int count2=-1;
    private int count3=-1;

    private int count1minX=9999;//Пингвин
    private int count1minY=9999;
    private int count1maxX=0;
    private int count1maxY=0;

    private int count2minX=9999;//Попугай
    private int count2minY=9999;
    private int count2maxX=0;
    private int count2maxY=0;

    private int count3minX=9999;//Воробей
    private int count3minY=9999;
    private int count3maxX=0;
    private int count3maxY=0;

    private String type;
    private boolean i = true;
    Scanner x = new Scanner(System.in);


    public Group()
    {
        birds = new ArrayList<>();
        System.out.println("Кого  добавить?(1-пингвин, 2-попугай,3-воробей, 4-достаточно)");
        while (i == true)
        {
            System.out.println(type = x.nextLine());
//
            switch (type)
            {
                case "1":
                    birds.add(new Penguin());
                    count++;
                    break;
                case "2":
                    birds.add(new Macaw());
                    count++;
                    break;
                case "3":
                    birds.add(new Vorobey());
                    count++;
                    break;
                case "4":
                    count=-1;
                    i=false;
                    break;
            }
        }
    }


    public void draw(Graphics g) {
        for (int i = 0; i < birds.size(); i++) {

            System.out.println("...: " + i);

            birds.get(i).draw(g);




            type = birds.get(i).vid;

            System.out.println("Вид: " + type);

            if (type=="Пингвин") {
                count2 = i;

                System.out.println("Пингвин count2: " + count2);

                if (birds.get(i).x < count1minX) {
                    count1minX = birds.get(i).x;
                }
                if (birds.get(i).x > count1maxX) {
                    count1maxX = birds.get(i).x;
                }
                if (birds.get(i).y < count1minY) {
                    count1minY = birds.get(i).y;
                }
                if (birds.get(i).y > count1maxY) {
                    count1maxY = birds.get(i).y;
                }
            }
            if (type == "Воробей") {
                count3 = i;
                System.out.println("Воробей: " + count3);
                if (birds.get(i).x < count3minX) {
                    count3minX = birds.get(i).x;
                }
                if (birds.get(i).x > count3maxX) {
                    count3maxX = birds.get(i).x;
                }
                if (birds.get(i).y < count3minY) {
                    count3minY = birds.get(i).y;
                }
                if (birds.get(i).y > count3maxY) {
                    count3maxY = birds.get(i).y;
                }
            }
            if (type=="Попугай") {
                count1 = i;
                System.out.println("Попугай: " + count1);
                if (birds.get(i).x < count2minX) {
                    count2minX = birds.get(i).x;
                }
                if (birds.get(i).x > count2maxX) {
                    count2maxX = birds.get(i).x;
                }
                if (birds.get(i).y < count2minY) {
                    count2minY = birds.get(i).y;
                }
                if (birds.get(i).y > count2maxY) {
                    count2maxY = birds.get(i).y;
                }
            }
        }



        if(count1>-1) {
            g.setColor(birds.get(count1).color);
            g.drawRect(count2minX, count2minY, count2maxX - count2minX + birds.get(count1).size, count2maxY - count2minY + birds.get(count1).size); // сама рамка


            System.out.println("Попугай: ");
            System.out.println(count1);
            System.out.println("Начало X: " + (count2minX) + "Начало Y: " + (count2minY));
            System.out.println("Ширина: "+ (count2maxX-count2minX+birds.get(count1).size)+ "Высота: " + (count2maxY-count2minY+ birds.get(count1).size));

        }

        if(count3>-1) {
            g.setColor(birds.get(count3).color);
            g.drawRect(count3minX, count3minY, count3maxX-count3minX+birds.get(count3).size,count3maxY-count3minY+ birds.get(count3).size);


            System.out.println("Воробей: ");
            System.out.println(count3);
            System.out.println("Начало X: " + (count3minX) + "Начало Y: " + (count3minY));
            System.out.println("Ширина: "+ (count3maxX-count3minX+birds.get(count3).size)+ "Высота: " + (count3maxY-count3minY+ birds.get(count3).size));

        }

        if(count2>-1) {
            g.setColor(birds.get(count2).color);
            g.drawRect(count1minX, count1minY, count1maxX-count1minX+birds.get(count2).size,count1maxY-count1minY+ birds.get(count2).size);


            System.out.println("Пингвин: ");
            System.out.println(count2);
            System.out.println("Начало X: " + (count1minX) + "Начало Y: " + (count1minY));
            System.out.println("Ширина: "+ (count1maxX-count1minX+birds.get(count2).size)+ "Высота: " + (count1maxY-count1minY+ birds.get(count2).size));
        }
    }

}