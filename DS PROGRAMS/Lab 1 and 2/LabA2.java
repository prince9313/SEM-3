import java.util.*;

public class LabA2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check for Odd or Even");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The number is Even");
        }

        else{
            System.out.println("The number is Odd");
        }

    }
}
