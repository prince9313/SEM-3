import java.util.Scanner;

public class Patt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines : -");
        int n = sc.nextInt();
        System.out.println();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}