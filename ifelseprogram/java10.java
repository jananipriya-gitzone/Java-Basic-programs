//Java Program to check a given input is alphabet or not
package ifelseprogram;
import java.util.Scanner;
public class java10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if((ch>='A'&& ch<='Z')||(ch>='a'&& ch <='z')){
            System.out.println("Given inout is a alphabet");
        }else{
            System.out.println("Given is not a alphaet");
        }
                scn.close();

    }
    
}
