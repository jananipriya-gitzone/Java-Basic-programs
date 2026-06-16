//Java program to print largest/maximum using if…else
package ifelse;
import java.util.Scanner;
public class large1 {
    public static void main(String[] args) {
        int largest;
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a value:");
        int a = scn.nextInt();
         System.out.println("Enter a 2nd value:");
        int b = scn.nextInt();
        if(a>b){
            largest=a;

        }
        else{
            largest = b;
        }
            System.out.println("Largest value is : "+ largest);
        scn.close();

    }
    
}
