

public class DeleteAtPosition {
    class Node {
        int info;
        Node link;
        int n;
        int count;

    public void Node(int data){
        this.info = data;
        this.link = null;
        this.n = 0;
        this.count = 0;
    }
}

    public Node first = null;
    public Node save = first;
    public Node pred = save;

    public void DeleteAtFirst(int data,int n,int count){
        Node newnode = new Node();
    
        if(first == null){
            System.out.println("Underflow");
        }
       while(count != 0 && save.link != null){
        count ++;
        pred = save;
        save = save.link;

        if(count == n){
            pred.link = save.link;
            return;
        }
       } 
    } 
}
