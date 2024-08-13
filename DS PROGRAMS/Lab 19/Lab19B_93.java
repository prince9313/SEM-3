
public class Lab19B_93 {
    public static void main(String[] args) {
        // Insertion Sort
        int[] arr = { 5, 2, 8, 1, 9 };

        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;

        }

        for(int i = 0;i < arr.length;i++){
        System.out.println(arr[i]);
        }
    }

}
