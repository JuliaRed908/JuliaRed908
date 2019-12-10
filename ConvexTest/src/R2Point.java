import java.util.Scanner;

class R2Point {
    public double x, y;
    private int k;
    private double R=0;
    Scanner scan = new Scanner(System.in);
    public R2Point(double x, double y) {
        this.x = x; this.y = y;

    }
    public R2Point() throws Exception {
        System.out.println("x=");
        System.out.println(x = scan.nextDouble());
        System.out.println("y=");
        System.out.println(y = scan.nextDouble());

        if(x>=50){
            if(y>=50 || y<=0){
                R=Math.abs(Math.sqrt((x-50)*(x-50)+(y-50)*(y-50)));
            }
            if(y<=50 && y>=0){
                R=x-50;
            }
            if(y<=0){
                R=Math.abs(Math.sqrt((x-50)*(x-50)+(y-0)*(y-0)));
            }
        }
        if(x<=50 && x>=0){
            if(y>=50){
                R=y-50;
            }
            if(y<=50 && y>=0){
                R=0;
            }
            if(y<=0){
                R=Math.abs(y);
            }
        }
        if(x<=0){
            if(y>=50){
                R=Math.abs(Math.sqrt((x-0)*(x-0)+(y-50)*(y-50)));
            }
            if(y<=50 && y>=0){
                R=Math.abs(x);
            }
            if(y<=0){R=Math.abs(Math.sqrt((x-0)*(x-0)+(y-0)*(y-0)));}
        }


        if(R<=50){
            k=k+1;
        }
        System.out.println("Расстояние отточки до квадрата="+R);
        System.out.println("Точек,находящихся от квадрата на расстоянии меньше 50 -"+k);
    }
    public static double dist(R2Point a, R2Point b) {
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
    public static double area(R2Point a, R2Point b, R2Point c) {
        return 0.5*((a.x-c.x)*(b.y-c.y)-(a.y-c.y)*(b.x-c.x));
    }


    public static boolean equal(R2Point a, R2Point b) {
        return a.x==b.x && a.y==b.y;
    }
    public static boolean isTriangle(R2Point a, R2Point b, R2Point c) {
        return area(a, b, c) != 0.0;
    }
    public boolean inside(R2Point a, R2Point b) {
        return (a.x <= x && x <= b.x || a.x >= x && x >= b.x) &&
                (a.y <= y && y <= b.y || a.y >= y && y >= b.y);

    }
    public boolean light(R2Point a, R2Point b) {
        double s = area(a, b, this);
        return s < 0.0 || ( s == 0.0 && ! inside(a, b));
    }
}