import java.util.Scanner;

public class LabA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (s == "a" | s == "e" | s == "i" | s == "o" | s == "u") {
            System.out.println("It is a vowel...");
        }

        else{
            System.out.println("It is not a vowel...");
        }
    }
}
