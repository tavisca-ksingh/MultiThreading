import java.util.Scanner;

public class CircleClaculaor {

     public static final double pi= 3.14;

    public static void main(String [] args)
    {
        double radius =  8;
        double area = areaOfCircle(radius);
        double Circumferance = circumferanceOfCircle(radius);
        System.out.println("Area : " + area + "  Circumferrence : " + Circumferance );
    }

    public static double areaOfCircle(double radius)
    {
        return   pi * radius * radius;
    }

    public static double circumferanceOfCircle(double radius)
    {
        return 2 * pi * radius;
    }


}
