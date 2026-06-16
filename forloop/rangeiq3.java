// print even numbers between given range
package forloop;
import java.util.Scanner;
public class rangeiq3 {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        System.out.print("Enter a start value :");
        int start =scn.nextInt();
        System.out.print("Enter a end value :");
        int end = scn .nextInt();
        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        scn.close();
    }
    
}
