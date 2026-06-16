//count of even numbers between given range
package forloop;
import java.util.Scanner;
public class rangeiq6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter a start value :");
        int start =scn.nextInt();
        System.out.print("Enter a end value :");
        int end = scn .nextInt();
        int count=0;
        for (int i=start; i<=end; i++){
            if (i%2==0){
                count ++;
            }
        }
        System.out.println(count);
        scn.close();
    }
    
}
