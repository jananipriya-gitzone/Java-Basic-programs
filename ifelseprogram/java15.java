//Java Program to check character is vowel or consonant
package ifelse;
import java.util.Scanner;
public class java15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        char ch = scn.next().charAt(0);
        if (( ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                System.out.println("given input is vowel");
            }else{
                System.out.println("COnsonent");
            }
        }else{
            System.out.println("incorrect value , type a character");
        }
       
            scn.close();

}
}
