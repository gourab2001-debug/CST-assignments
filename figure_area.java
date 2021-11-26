import java.lang.Math;
class figure {
    double area(int l, int b)
    {
        return l*b;
    }
    double area(double a, double b, double c)
    {
        double s = ((a+b+c)/2);
        if(s <= a || s <=b || s<= c)
        {
            System.out.println("Invalid triangle");
            return -1;
        }
        double areasq = (s*(s-a)*(s-b)*(s-c));
        double area = Math.sqrt(areasq);

        return area;
    }
}

class rectangle extends figure{

}

class triangle extends figure{

}

public class figure_area {
    public static void main(String[] args)
    {
        rectangle r1 = new rectangle();
        triangle t1 = new triangle();

        double rec_area = r1.area(10, 25);
        double tri_area = t1.area(10, 12, 13);

        System.out.println("Shape \t\t Area");
        System.out.printf("Rectangle \t%.2f\n", rec_area);
        System.out.printf("Triangle \t%.2f", tri_area);

    }
}
