package ifelseprogram;

import java.util.Scanner;

public class secbig {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter value of a : ");
        a=scn.nextInt();
        System.out.println("Enter value of b : ");
        b=scn.nextInt();
        System.out.println("Enter value of c : ");
        c=scn.nextInt();
        if((a<=b&&a>=c)||(a<=c&&a>=b)){
            System.out.println("second  largest value is :" + a);

        }else if ((b>=a&&b<=c)||(b<=a&&b>=c)){
            System.out.println("second  largest value is :"+ b);
        }
        else{
            System.out.println("second  largest value is :" + c);
        }

        scn.close();

        
    }
    
}
