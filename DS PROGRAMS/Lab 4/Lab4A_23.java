import java.util.Scanner;

public class Lab4A_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("======="); 
            arr[i] = sc.nextInt();
        }

        int temp = 0;

        

        int[] newarr = new int[n+1];

        System.out.println("Enter the position to insert an element");
        int pos = sc.nextInt();

        System.out.println("Enter the elemnt to insert an element");
        int ele = sc.nextInt();
        
        

        for (int i = 0; i < n+1; i++) {
            if (i < pos){
                newarr[i] = arr[i];
            }
            else if (i == pos) {
                newarr[i] = ele;
            }
            else{
                newarr[i] = arr[i -1];
            }
        }
            for (int i = 0; i < n; i++) {
                System.out.println(newarr[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(newarr[i] + " ");
            }
            for (int i = 0; i < newarr.length - 1; i++) {
                for (int j = 0; j < newarr.length - i - 1; j++) {
                    if (newarr[j] > newarr[j+1]) {
                        temp = newarr[j];
                        newarr[j] = newarr[j+1];
                        newarr[j+1] = temp;
                    }
                }
            }
    }
}
