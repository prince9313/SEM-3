class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class Lab12A_63 {
    // Function to copy linked list
    public static Node copyList(Node first) {
        if (first == null) {
            return null;
        }

        // Create a new first node
        Node newFirst = new Node(first.data);
        Node current = newFirst;
        Node original = first.link;

        // Iterate through the original list and copy each node
        while (original != null) {
            current.link = new Node(original.data);
            current = current.link;
            original = original.link;
        }

        return newFirst;
    }

    // Function to print linked list
    public static void printList(Node first) {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create original linked list
        Node first = new Node(1);
        first.link = new Node(2);
        first.link.link = new Node(3);
        first.link.link.link = new Node(4);

        System.out.println("Original list:");
        printList(first);

        // Copy the linked list
        Node copiedList = copyList(first);

        System.out.println("Copied list:");
        printList(copiedList);
    }
}
