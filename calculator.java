import java.io.*;
public class calculator {
    static int a, b;
    calculator(int x, int y){
        a = x;
        b = y;
    }
    static int addition(){
        return (a+b);
    }
    static int subtraction(){
        return (a-b);
    }
    static int multiplication(){
        return (a*b);
    }
    static int division(){
        return (a/b);
    }

    void display(){
        System.out.println(a + " + " + b + " = " + addition());
        System.out.println(a + " - " + b + " = " + subtraction());
        System.out.println(a + " * " + b + " = " + multiplication());
        System.out.println(a + " / " + b + " = " + division());
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2;
        System.out.println("Enter the number 1 : ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the number 2 : ");
        num2 = Integer.parseInt(br.readLine());

        calculator obj1 = new calculator(num1, num2);
        obj1.display();
    
    }
}
