//print to do all numbers between given range in reverse order
package forloop;
import java.util.Scanner;
public class rangeiq2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter a start value :");
        int start = scn.nextInt();
        System.out.print("Enter a end value");
        int end = scn.nextInt();
        for(int i=end; i>=start; i--){
            System.out.println(i);
        }
                scn.close();

        
    }
    
}
