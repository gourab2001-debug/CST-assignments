public class shape {
    double vol;
    char c;

    void volume(int len, int bred, int height) {
        vol = len * bred * height;
        c = 'r';
    }

    void volume(int side) {
        vol = side * side * side;
        c = 'c';
    }

    void volume(int rad, int height) {
        vol = 3.14 * height * rad * rad;
        c = 'd';
    }

    void display() {
        if (c == 'r')
            System.out.println("The volume of the rectangular box = " + vol);
        else if (c == 'c')
            System.out.println("The volume of the Cube = " + vol);
        else
            System.out.println("The volume of the Cylinder = " + vol);
    }

    public static void main(String[] args) {
        shape rectangle = new shape();
        shape cube = new shape();
        shape cylinder = new shape();

        rectangle.volume(10, 12, 10);
        cube.volume(5);
        cylinder.volume(10, 10);

        rectangle.display();
        cube.display();
        cylinder.display();
    }
}
