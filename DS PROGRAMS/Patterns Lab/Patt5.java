
public class Patt5 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("3 ");
                } else if (i == 2 || i == 4 || j == 2 || j == 4) {
                    System.out.print("2 ");
                } else if (i == 3 || j == 3) {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
