import java.util.*;

public class LabA3 {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character to check if it is a Vowel or not");
        char c = sc.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("The entered Character is a Vowel");
        }

        else{
            System.out.println("The entered Character is not a Vowel");
        }
    }
}
