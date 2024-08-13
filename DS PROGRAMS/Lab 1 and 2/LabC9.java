import java.util.*;

public class LabC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Seconds :");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds1 = seconds % 60;
        System.out.println("Hours : " + hours + " Minutes : " + minutes + " Seconds : " + seconds1+"");

    }
}
