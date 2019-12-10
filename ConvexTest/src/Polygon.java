import java.awt.*;
import java.awt.geom.Line2D;
import java.io.Console;

class Polygon extends Deq implements Figure {

    private boolean i = true;
    private double s, p;
    private void grow(R2Point a, R2Point b, R2Point t) {
        ConvexTest.w1.repaint();
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

        int k=0;


        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        //int array_length = array.length;

        int low = 0;
        int high = array.length - 1;
        Boolean first_step = true;
        Boolean first = true;
        int last_a = 0;

        while ( low <= high ) {
           if ( array[low] != null ) {
               if ( !first ) { //уже есть координаты второй точки, то ставим сначала коорды второй точки потом этой
                   Shape l = new Line2D.Double(array[high+1].x, array[high+1].y,  array[low].x, array[low].y);
                   g2.draw(l);
                   System.out.println(array[high+1].x + " " + array[high+1].y + " " + array[low].x + " " + array[low].y);
                   last_a = low ;
               } //если нет то идем во второй цикл
               while ( high > low ) {
                   if ( array[high] != null ) {
                           Shape l = new Line2D.Double(array[low].x, array[low].y,  array[high].x, array[high].y);
                       g2.setPaint(Color.red);
                           g2.draw(l);
                           System.out.println(array[low].x + " " + array[low].y + " " + array[high].x + " " + array[high].y);
                           last_a = high;
                           first = false; //первые координаты проставлены
                       high--;
                       break;
                   }
                   high--;
                }

               if ( high == low ) { //если достигли конца циклов то ставим последние координаты и самой первой точки
                   Shape l = new Line2D.Double(array[last_a].x, array[last_a].y, array[0].x, array[0].y);
                   g2.setPaint(Color.red);
                   g2.draw(l);
                   System.out.println(array[last_a].x + " " + array[last_a].y + " " + array[0].x + " " + array[0].y);

               }

           }
           low++;
        }
        

 for ( int x = 0; x < array.length; x++) {

     if ( array[x] != null ) {
         System.out.println("X: " + x + " " + array[x].x + " " + array[x].y);
     }
 }



        return;

    }


}
//