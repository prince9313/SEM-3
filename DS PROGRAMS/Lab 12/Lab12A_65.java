class Node{
    int info;
    Node link;

    Node(int data){
        this.info = data;
        this.link = null;
    }
}
public class Lab12A_65 {
    
    public static Node sortList(Node First) {
        Node save = First, next = null;
        int temp;
        while (save.link != null) {
            next = save.link;
            while (next != null) {
                if (save.info <= next.info) {
                    next = next.link;
                } else {
                    temp = save.info;
                    save.info = next.info;
                    next.info = temp;
                }
            }
            save = save.link;
        }
        return First;
    }

    public static void printList(Node First) {
        Node save = First;
        while (save != null) {
            System.out.println(save.info);
            save = save.link;
        }
    }

    public static void main(String[] args) {
        Node First = new Node(1);
        First.link = new Node(3);
        First.link.link = new Node(2);
        System.out.println("Original List");
        printList(First);
        System.out.println("Sorted list");

        Node newList = sortList(First);
        printList(newList);

    }
}