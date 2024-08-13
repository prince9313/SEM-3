import java.util.*;

public class Patt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j%2 ==0){
                    System.out.print("+");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
