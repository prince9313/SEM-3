//15
//07 14
//06 08 13
//02 05 09 12
//01 03 04 10 11

public class Patt6 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if(j%i == 0){
                System.out.print(i + " ");
                }
                else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
