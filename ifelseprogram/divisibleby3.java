//Java Program to check given number is divisible by 3
package ifelseprogram;
import java.util.Scanner;
public class divisibleby3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        if(a%3==0){
            System.out.println("divisible by 3");
        }else{
            System.out.println("Not divisible by 3");
        }
        scn.close();

    }
    
}
