public class DeleteAtFirst {
    class Node {
        int info;
        Node link;
    

    public void Node(int data){
        this.info=data;
        this.link=null;
    }
}

    public Node first = null;
    public void DeleteAtFirst(int data){
        Node newnode = new Node();
        
    
        if(first == null){
            System.out.println("Underflow");
        }
        else{
            first = first.link;
        }
    } 
}
