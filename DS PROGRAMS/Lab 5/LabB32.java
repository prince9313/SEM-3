import java.util.*;
public class LabB32 {
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words to store in an array : -");
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter the elements in the array.....");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            }

        int x = (int)(Math.random() * n);
        
        System.out.println("The word at random index "+x+" is :-");
        System.out.println(arr[x]);

        System.out.println("Enter the anagram of the word shown above..........");
        String anagram = sc.next();

        int b = anagram.length();

        if (arr[x].length() != anagram.length()) {
            System.out.println("Plese enter appropriate array of same length...........");

        }
        else{
          char[] str1 = arr[a].toCharArray();
          char[] str2 = anagram.toCharArray();

          if(Arrays.equals(str1,str2)){
            System.out.println("The entered word is an anagram of the word at random index "+x);
          }
          else{
            System.out.println("The entered word is not an anagram of the word at random index "+x);
          }
        }
        
    }
}
