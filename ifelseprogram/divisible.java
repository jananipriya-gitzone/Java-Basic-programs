//"Check if a number is divisible by 5 and 11"
package ifelse;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else {
            System.out.println("Not divisible by both 5 and 11");
        }

        scn.close();
    }
}