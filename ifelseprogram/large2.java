//Find largest/maximum using Math.max()
package ifelseprogram;
import java.util.Scanner;
public class large2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a value:");
        int a = scn.nextInt();
         System.out.println("Enter a 2nd value:");
        int b = scn.nextInt();
            System.out.println("Largest value is : "+ Math.min(a,b));
        scn.close();

    }
    
}
