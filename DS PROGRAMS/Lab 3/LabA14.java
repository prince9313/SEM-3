import java.util.*;

public class LabA14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number m : ");
        int m = scanner.nextInt();

        System.out.println("Enter another number n : ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }    

        System.out.println("The sum of numbers from m to n is : "+sum);
    }
}
