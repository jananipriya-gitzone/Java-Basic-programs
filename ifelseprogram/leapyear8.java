package ifelse;

import java.util.Scanner;

public class leapyear8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%400==0){
            System.out.println("Leap year");
        }else if( a %100==0){
            System.out.println("Not leap");
        }else if(a%4==0){
            System.out.println("Leap yearr");
        }
        else{
            System.out.println("Not a leap");
        }
                scn.close();

    }
    
}
