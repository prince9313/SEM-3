public class LabC12 {
    public static void main(String[] args) {
        int a = 1, b = 1000;

        for (int i = a; i <= b; i++) {
            int count = 0;
            int temp = a;
            while (a > 0) {
                count++;
                a = (a / 10);
            }

            a = temp;
            
        }
    }
}
