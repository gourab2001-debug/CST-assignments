// programme that will take a set of integer numbers as command line
// arguments and will print the sum and average of these numbers.
public class average {
    public static void main(String[] args){
        int sum = 0;
        float average;
        for(int i = 0; i<args.length ; i++){
            sum += Integer.parseInt(args[i]);
        }
        average = sum/args.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
