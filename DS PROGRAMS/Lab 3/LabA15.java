
import java.util.Scanner;


public class LabA15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        double n = sc.nextDouble();
        double sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        double avg = (sum/2);

        System.out.println("The average of the given numbers is :-"+avg);
    }    
}
