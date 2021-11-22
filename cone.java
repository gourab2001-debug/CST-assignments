public class cone {
    int radius, height;

    // Constuctor without any argument
    cone() {
        radius = height = 0;
    }

    // Constuctor with arguments
    cone(int r, int h) {
        radius = r;
        height = h;
    }

    double volume() {
        return (3.14 * height * radius * radius / 3);
    }

    public static void main(String[] args) {
        cone c1 = new cone(5, 9);
        cone c2 = new cone();
        c2.radius = 10;
        c2.height = 30;

        System.out.println("The volume of the first cone = " + c1.volume());
        System.out.println("The volume of the Second cone = " + c2.volume());
    }
}
