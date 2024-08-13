class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Middle {

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        for (; fast != null && fast.next != null; fast = fast.next.next) {
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find the middle node
        Node middle = findMiddle(head);
        System.out.println("The middle node is: " + middle.data);
    }
}
