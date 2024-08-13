import  java.util.*;

public class Lab4A_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("======="); 
            arr[i] = sc.nextInt();
        }

        int[] newarr = new int[n-1];

        System.out.println("Enter the position to delete an element");
        int pos = sc.nextInt();

        for (int i = 0; i < n-1; i++) {
            if(i < pos){
                newarr[i] = arr[i];
            }
            else if (i == pos) {
                continue;
            }
            else{
                newarr[i] = arr[i + 1];
            }
            }

            for (int i = 0; i < n-1; i++) {
                System.out.print(newarr[i] + " ");
            }
        }
            
    }

