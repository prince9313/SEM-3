
import java.util.*;

class Queue {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node top = null;
    Node first = null;

    public void push(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        Node save = first;
        while (save.link != null) {
            save = save.link;
        }
        save.link = newNode;
    }

    public int pop() {
        if (first == null) {
            System.out.println("stack is underflow");
        } else {
            first = first.link;
        }
        return first.info;
    }

    public void display() {
        Node save = first;
        System.out.println("ans");
        while (save != null) {
            System.out.println(save.info + ",");
            save = save.link;
        }
    }
}

public class Lab11A_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q1 = new Queue();

        while (true) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to Pop");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter 4 to Exit");
            int c = sc.nextInt();
            int data;

            if (c == 1) {
                System.out.println("Enter a push value");
                data = sc.nextInt();
                q1.push(data);
            }
            if (c == 2) {
                q1.pop();
            }
            if (c == 3) {
                q1.display();
            }
            if (c == 4) {
                break;
            }

        }
    }
}
