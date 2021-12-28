// Question no : 16
import java.util.Scanner;
abstract class Person {
    String[] data;
    abstract void read();
    abstract void print();
}
class Student extends Person {
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student data : ");
        String str = sc.nextLine();
        if(str != "") {
            data = str.split(" ");
        }
        sc.close();
    }
    void print()
    {
        System.out.println("Printing student data : ");
        for (int i = 0; i<data.length; i++) {
            System.out.print(data[i] +" ");
        }
    }
}
class Teacher extends Person {
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher data : ");
        String str = sc.nextLine();
        if(str != "") {
            data = str.split(" ");
        }
        sc.close();
    }
    void print()
    {
        System.out.println("Printing student data : ");
        for (int i = 0; i<data.length; i++) {
            System.out.print(data[i] +" ");
        }
    }
}
public class javaPersons {
    public static void main(String[] args) {
        Person st1 = new Student();
        st1.read();
        st1.print();
    }
}
