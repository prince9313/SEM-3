import java.util.*;

public class Lab9A_50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Queue :");
        int max = sc.nextInt();
        Queue que = new Queue(max);
        
        while (true) {
            System.out.println("Enter 1 to insert an element in queue");
            System.out.println("Enter 2 to delete an element fron queue");
            System.out.println("Enter 3 to display the queue");
            System.out.println("Enter 4 for Exit");
            
            int c = sc.nextInt();
            int data;
            if(c == 1){
                data = sc.nextInt();
                que.enQueue(data);
            }
            else if (c == 2){
                que.deQueue();
            }
            else if (c == 3){
                que.displayQueue();
            }
            else if(c == 4){
                break;
            }
        }

    
    }
}

class Queue {
    int[] arr;
    static int FRONT;
    static int REAR;
    int max;
    int y;

    Queue(int max) {
        this.max = max;
        this.FRONT = 0;
        this.REAR = -1;
        arr = new int[max];
    }

    public void enQueue(int data) {
        if (REAR >= max) {
            System.out.println("Queue Overflow");
        }

        else {
            REAR++;
            arr[REAR] = data;
        }
        System.out.println(arr[REAR]);
    }

    public int deQueue() {
        if (FRONT == 0) {
            System.out.println("Queue Underflow");
        }

        else if (FRONT == REAR) {
            FRONT = 0;
            REAR = 0;
        }

        else {
            y = arr[FRONT];
        }
        return y;
    }

    public void displayQueue() {
        for (int i = FRONT; i <= REAR; i++) {
            System.out.println(arr[i]);
        }
    }

}
