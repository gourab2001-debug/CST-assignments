import java.io.*;

class rectangle {
    int length, width, perimeter;
    double area;

    rectangle(int l, int w) {
        length = l;
        width = w;
    }

    double area() {
        area = length * width;
        return area;
    }

    int perimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }
}

public class myRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Length of the rectangle: ");
        int length = Integer.parseInt(br.readLine());
        System.out.println("Enter the width of the rectangle: ");
        int width = Integer.parseInt(br.readLine());

        rectangle r1 = new rectangle(length, width);

        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());
    }
}