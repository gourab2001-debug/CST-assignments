import java.io.*;

public class stack {
    int[] myArr;
    int top;
    int MAX = 5;

    stack() {
        top = -1;
        myArr = new int[MAX];
    }

    boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    boolean isFull() {
        if (top == MAX - 1)
            return true;
        return false;
    }

    void push(int num) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            top += 1;
            myArr[top] = num;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            int remVal = myArr[top];
            top--;
            System.out.println("Itm removed = " + remVal);
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return myArr[top];
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Item of the stack : ");
            for (int i = top; i >= 0; i--) {
                System.out.print(myArr[i] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        stack st1 = new stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice;

        do {
            System.out.print("1.Push, 2.Peek, 3.Pop, 4.Display, 0.Exit\n");
            System.out.print("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());
            int val;
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    val = Integer.parseInt(br.readLine());
                    st1.push(val);
                    break;
                case 2:
                    System.out.println("The top element of your stack is: " + st1.peek());
                    break;
                case 3:
                    st1.pop();
                    break;
                case 4:
                    st1.display();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose proper response!");
            }
        } while (choice != 0);

    }
}
