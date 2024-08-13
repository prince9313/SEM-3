import java.util.Scanner;

public class Patt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        System.out.println();
        int c = 1;
        char ch ='a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch+"");
                    ch++;
                }
                else{
                    System.out.print(c+"");
                    c++;
                }
            }
            System.out.println();
        }
    }
}