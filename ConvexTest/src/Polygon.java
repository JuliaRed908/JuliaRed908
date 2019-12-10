import java.awt.*;
import java.awt.geom.Line2D;
import java.io.Console;



import static java.lang.Math.sqrt;
import static java.lang.Math.abs;


class Polygon extends Deq implements Figure {

    private boolean i = true;
    private double s, p;
    private void grow(R2Point a, R2Point b, R2Point t) {
        p -= R2Point.dist(a, b);
        s += Math.abs(R2Point.area(a, b, t));
    }
    public Polygon(R2Point a, R2Point b, R2Point c) {
        pushFront(b);if (b.light(a, c)) {
            pushFront(a); pushBack(c);
        } else {
            pushFront(c); pushBack(a);
        }
        p = R2Point.dist(a, b) + R2Point.dist(b, c)
                + R2Point.dist(c, a);
        s = Math.abs(R2Point.area(a, b, c));
    }
    public double perimeter() {
        return p;
    }
    public double area() {
        return s;
    }
    public Figure add(R2Point t) {
        int i;
// Ищем освещенные ребра, просматривая их одно за другим.
        for (i=length(); i>0 && !t.light(back(),front()); i--)
            pushBack(popFront());
// УТВЕРЖДЕНИЕ: либо ребро [back(),front()] освещено из t,
// либо освещенных ребер нет совсем.
        if (i>0) {
            R2Point x;
            grow(back(), front(), t);
// Удаляем все освещенные ребра из начала дека.
            for (x = popFront(); t.light(x, front()); x = popFront())
                grow(x, front(), t );
            pushFront(x);
// Удаляем все освещенные ребра из конца дека.
            for (x = popBack(); t.light(back(), x); x = popBack())
                grow(back(), x, t);
            pushBack(x);
// Завершаем обработку добавляемой точки.
            p += R2Point.dist(back(), t) + R2Point.dist(t, front());
            pushFront(t);
        }

        return this;
    }

    public void draw(Graphics g){


        int[] MyArray1 =new int[array.length];
        int[] MyArray2 =new int[array.length];
        for(int i=0; i<array.length;i++){

            MyArray1[i]=(int)back().x;

            MyArray2[i]=-(int)back().y;

            g.setColor(Color.RED);
            g.fillPolygon(MyArray1, MyArray2, array.length);
            g.setColor(Color.BLACK);
            g.drawLine((int)front().x, -(int)front().y, (int)back().x, -(int)back().y);
            g.fillOval((int)front().x -2, -(int)front().y-2, 5,5);
            pushBack(popFront());
            g.setColor(Color.RED);





        }


       /* int k=0;

        g.fillPolygon(MyArray1, MyArray2, array.length);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        for (int m = 0; m <array.length; m++) {
            //R2Point a = array[i-1];
            //R2Point b = array[i];
            //Shape l = new Line2D.Double(a.x,a.y,b.x,b.y);
            //g2.draw(l);

            //k = array.length + 1;

            System.out.println("Array M " + m + " "  + array[m]);

            if (array[m] !=null ){ k=k+1;}

        }





            int m=0;
        int[] MyArray =new int[k+1];
        int l1=0;

        int x__ = 15; int y__ = 0;

        for ( int k_ = MyArray.length; k_ > 0; k_-- ) {
            if ( k_ > 1 ) {
                MyArray[y__] = x__;
                y__++;
                MyArray[y__] = (15 - x__);
                k_--; y__++; x__--;
            } else {
                MyArray[y__] = x__;
            }
        }




        MyArray[k] = MyArray[0];
        System.out.println("Array: " + MyArray[0]);

            m=0;
            //String error = null;
            R2Point a = null;
            R2Point b = null;

            for ( int x_ = 0; x_ <= MyArray.length; x_++) {
                if ( (MyArray.length - x_) > 1 ) {
                    int a_ = MyArray[x_];
                    int x___ = x_ + 1;
                    int b_ = MyArray[x___];
                    a = array[a_];
                    b = array[b_];

                    try {

                        double ax = a.x;
                        double ay = a.y;

                        double bx = b.x;
                        double by = b.y;

                        Shape l = new Line2D.Double(ax, ay, bx, by);
                        g2.draw(l);
                    } catch ( Exception e ) {
                        System.out.println("Точки не существует в R2Point: " + e);
                        double mx = abs(a.x);
                        double my= abs(a.y);
                        int n=0;
                         double       mm=sqrt((a.x-10)*(a.x-10)+(a.y-10)*(a.y-10));
                        double       mm2=sqrt((a.x-0)*(a.x-0)+(a.y-10)*(a.y-10));
                        double       mm3=sqrt((a.x-0)*(a.x-0)+(a.y-0)*(a.y-0));
                        double       mm4=sqrt((a.x-10)*(a.x-10)+(a.y-0)*(a.y-0));
                        if(mx>10 & my>10 & a.x>0 & a.y>0 & mm<10){ n++;

                        }
                        if(mx>10 & my>10 & a.x>0 & a.y<0 & mm4<10){ n++;

                        }
                        if( a.x<0 & a.y<0 & mm3<10){ n++;

                        }
                        if( a.x<0 & a.y>0 & mm2<10){ n++;

                        }
                        System.out.println("Точек близ квадрата: " + n);
                    }

                        //System.out.println(error);
                }
            }


        return;*/

    }


}
//