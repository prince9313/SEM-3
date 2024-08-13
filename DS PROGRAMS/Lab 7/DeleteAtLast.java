public class DeleteAtLast {
    class Node {
        int info;
        Node link;
    

    public void Node(int data){
        this.info=data;
        this.link=null;
    }
}

    public Node first = null;
    public Node last = first;

    public void DeleteAtFirst(int data){
        Node newnode = new Node();
        
    
        if(first == null){
            System.out.println("Underflow");
        }
       while(last.link.link != null){
        last = last.link;
       }

       last.link = null;
    } 
}
