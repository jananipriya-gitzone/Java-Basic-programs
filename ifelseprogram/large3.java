//Find largest/maximum using user-defined function
package ifelse;
import java.util.Scanner;
public class large3 {
    public static int LargegTwo(int a, int b) {
        return(a>b)? a:b;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println("Largest value is :" + LargegTwo(a, b));

                scn.close();

    }
    
}
