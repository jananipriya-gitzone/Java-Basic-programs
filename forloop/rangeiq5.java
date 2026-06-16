//multiples of 6 between given range in reverse order
package forloop;
import java.util.Scanner;
public class rangeiq5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter a start value :");
        int start =scn.nextInt();
        System.out.print("Enter a end value :");
        int end = scn .nextInt();
        for( int i=end; i>=start; i--){
            if(i%6==0){
                System.out.println(i);
            }
        }
scn.close();
    }
    
}
