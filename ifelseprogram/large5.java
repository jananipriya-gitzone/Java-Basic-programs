package ifelseprogram;
import java.util.Scanner;

public class large5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int d = (a>b && a>c) ? a :((b>c)? b : c);
        System.out.println("Largest value is :" + d);

                scn.close();

    }
    
}
