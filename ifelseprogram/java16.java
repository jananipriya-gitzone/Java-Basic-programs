//Check character is uppercase or lowercase in Java
package ifelse;
import java.util.Scanner;
public class java16 {
    public static void main(String[] args) {
        Scanner scn =new Scanner( System.in);
        char ch=scn.next().charAt(0);
        if(ch>='a'&&ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
                scn.close();

    }
    
}
