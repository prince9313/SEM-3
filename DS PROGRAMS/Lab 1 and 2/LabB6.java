
import java.util.Scanner;


public class LabB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of a number : ");
        int base = sc.nextInt();

        System.out.println("Enter an exponent for the number :");
        int exponent = sc.nextInt();

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        System.out.println("The power of "+base+" raise to "+exponent+" is :- "+result);
    }
}
