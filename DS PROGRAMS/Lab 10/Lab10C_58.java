import java.util.*;

public class Lab10C_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of info field of node");
        int data = sc.nextInt();
        List l1 = new List();
        l1.countNode(data);
    }
}

class List {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    Node first = null;

    public int countNode(int data) {
        Node newNode = new Node(data);
        int count = 1;
        if (first == null) {
            first = newNode;
            return count;
        }
        Node save = first;
        while (save.link != null) {
            save = save.link;
            count++;
        }
        return count;
    }
}
