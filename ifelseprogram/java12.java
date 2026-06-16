//Java Program to check number is positive or negative
package ifelse;
import java.util.Scanner;
public class java12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        if(a<0){
            System.out.println("Negative value");
        }else{
            System.out.println("Positive value");
        }
                scn.close();

    }
    
}
