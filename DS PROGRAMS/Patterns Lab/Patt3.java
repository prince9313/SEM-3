import java.util.*;

public class Patt3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines : -");
        int n = sc.nextInt();
        System.out.println();
        for(int i = 0; i <= n;i++){
            for(int k = 0; k <= n -i -1; k++){
                System.out.print(" ");
        }
        for(int j = 0; j <= i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }    
}
}
