
class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

public class Lab12A_64 {

     public static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void printList(Node first){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.link;
        }
    }
    public static void main(String[] args) {
        // Create original linked list
        Node first = new Node(1);
        first.link = new Node(2);
        first.link.link = new Node(3);
        first.link.link.link = new Node(4);
        first.link.link.link.link = new Node(5);

        System.out.println("Original list:");
        printList(first);

        // Copy the linked list
        Node revList = reverse(first);

        System.out.println("Copied list:");
        printList(revList);
    }

}
