import java.util.*;

public class Lab10A_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List l1 = new List();
        while (true) {
            System.out.println("Enter 1 to insert a node at first");
            System.out.println("Enter 2 to display all node");
            System.out.println("Enter 3 to delete first node");
            System.out.println("Enter 4 to delete last node");
            System.out.println("Enter 5 to insert a node at last");
            System.out.println("Enter 6 to delete a node at given position");
            System.out.println("Enter 7 to exit");
            int c = sc.nextInt();
            int data;

            if (c == 1) {
                System.out.println("Enter a value of node info");
                data = sc.nextInt();
                l1.insertAtFirst(data);
            } else if (c == 2) {
                l1.displayAllNode();
            } else if (c == 3) {
                l1.deleteAtFirst();
            } else if (c == 4) {
                l1.deleteAtLast();
            } else if (c == 5) {
                data = sc.nextInt();
                l1.insertAtLast(data);
            } else if (c == 6) {
                System.out.println("Enter a position");
                int n = sc.nextInt();
                l1.deleteAtPosoition(n);
            } else if (c == 7) {
                break;
            }

        }
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

    public Node first = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        } else {
            newNode.link = first;
            first = newNode;
        }
    }

    public void displayAllNode() {
        Node save = first;
        while (save.link != null) {
            System.out.println(save.info);
            save = save.link;
        }
    }

    public void deleteAtFirst() {
        if (first == null) {
            System.out.println("underflow");
            return;
        } else {
            Node save = first;
            save = save.link;
            first = null;
            first = save;

        }
    }

    public void deleteAtLast() {

        if (first == null) {
            System.out.println("underflow");
            return;
        }
        Node save = first;
        while (save.link.link != null) {
            save = save.link;
        }
        save.link = null;
        return;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
        }
    }

    public void deleteAtPosoition(int n) {

        int count = 1;
        if (first == null) {
            System.out.println("underflow");
            return;
        }

        Node save = first;
        Node pred = first;
        while (count != n && save.link != null) {
            pred = save;
            save = save.link;
            count++;

        }
        if (count == n) {
            pred.link = save.link;
        }

    }
}