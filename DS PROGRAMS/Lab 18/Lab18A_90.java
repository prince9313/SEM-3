import java.util.*;

public class Lab18A_90 {

    public static int linearSearch(int[] arr, int n, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value of element " + i+1);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int index = linearSearch(arr, length, n);
        if (index == 1) {
            System.out.println("Element is present at index " + index);
        } else {
            System.out.println("Element is not present in array");
        }
    }
}