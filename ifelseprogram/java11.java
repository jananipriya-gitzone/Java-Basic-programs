//Java Program to check input is Digit or Alphabets or Special Character
package ifelseprogram;
import java.util.Scanner;
public class java11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        char ch = scn.next().charAt(0);
        if(ch>='0' && ch<='9'){
            System.out.println("given input is an digit");
        }else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
            System.out.println("Given input is an alphabet");

        }else{
            System.out.println("Given input is a Special Character");
        }
                scn.close();

    }
}
