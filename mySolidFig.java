// Question No : 17

interface SolidFig {
    final double pi = 3.14;

    double calVolume(double radius, double height);
}

class cylinder implements SolidFig {
    double volume;

    public double calVolume(double radius, double height) {
        volume = pi * radius * radius * height;
        return volume;
    }
}

class cone implements SolidFig {
    double volume;

    public double calVolume(double radius, double height) {
        volume = (pi * radius * radius * height) / 3;
        return volume;
    }
}

public class mySolidFig {
    public static void main(String[] args) {
        cone c1 = new cone();
        double c1_volume = c1.calVolume(10, 9);
        cylinder c2 = new cylinder();
        double c2_volume = c2.calVolume(10, 9);

        System.out.println("Cone volume = " + c1_volume);
        System.out.println("Cylinder volume = " + c2_volume);
    }
}
