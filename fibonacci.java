import java.io.*;
public class fibonacci {
    fibonacci(int num){
        int curr = 0, next = 1, prev;
        while(num > 0){
            System.out.println(curr + " ");
            prev = curr;
            curr = next;
            next = prev + curr;
            num--;
        }
    }
    public static void main(String[] args) throws IOException{
        fibonacci fb = new fibonacci(6);
    }
}
