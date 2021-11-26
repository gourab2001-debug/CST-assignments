import java.io.*;
// superclass Rectangle that calculates the area of a rectangle 
class Rectangle{
    int length, bredth;
    int area;
    Rectangle(int l, int b){
        length = l;
        bredth = b;
    }
    int Area(){
        area = length*bredth;
        return area;
    }
}
// subclass RectBox that calculates the volume of a rectangular box
class RectBox extends Rectangle{
    int height;
    int volume;
    RectBox(int l, int b, int h){
        super(l, b);
        height = h;
    }
    int volume(){
        volume = length * bredth * height;
        return volume;
    }
}

public class myRectBox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Length of the RectBox: ");
        int length = Integer.parseInt(br.readLine());
        System.out.println("Enter the width of the RectBox: ");
        int bredth = Integer.parseInt(br.readLine());
        System.out.println("Enter the width of the RectBox: ");
        int height = Integer.parseInt(br.readLine());

        RectBox rb = new RectBox(length, bredth, height);
        System.out.println("The volume of the RectBox is = " + rb.volume() + " cube units.");
    }
}
