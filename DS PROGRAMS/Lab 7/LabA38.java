import java.util.Scanner;

class Stack {
    int[] arr;
    int top;
    int max;

    Stack(int max) {
        this.max = max;
        this.top = -1;
        arr = new int[max];
    }

    public void push(int n) {
        if (top >= max) {
            System.out.println("Stack Overflow");

        } else {
            top++;
            arr[top] = n;
        }
    }
}

public class LabA38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack :");
        int max = sc.nextInt();

        Stack stk = new Stack(max);
        stk.push(1);
        stk.push(2);
        stk.push(3);
    }
}
