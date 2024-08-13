import java.util.*;

public class Lab10A_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for info field");
        int data = sc.nextInt();
        List l1 = new List();
        l1.printNode(data);
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

    public void printNode(int data) {

        Node newNode = new Node(data);
        System.out.println("info of new node = " + newNode.info);
        System.out.println("link of new node = " + newNode.link);
    }

}
