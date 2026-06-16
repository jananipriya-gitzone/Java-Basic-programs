//Java Program to Check Given Input is Digit or Not

package ifelseprogram;

import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char a = scn.next().charAt(0);
        if(a>='0' && a<='9'){
            System.out.println(" Given Input is a Digit");
        }else{
            System.out.println("Given Input is not a Digit");
        }


        scn.close();

        
    }
    
}
