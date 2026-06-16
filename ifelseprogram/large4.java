//Find largest among three using if…else
package ifelseprogram;
import java.util.Scanner;
public class large4{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in);
        int a = scn. nextInt();
        int b = scn. nextInt();
        int c = scn. nextInt();
        if(a>b && a>c){
            System.out.println("Max number is :" + a);
        }else if( b>c){
            System.out.println("MAx number is :" +b);
        }
        else{
            System.out.println("MAx number is :" + c);
        }
        scn.close();

    }
}