//Java Program to print week day for a given input week
package ifelse;
import java.util.Scanner;
public class java17 {
    public static void main(String[] args) {
        
    
    Scanner scn =  new Scanner(System.in);
    int num = scn.nextInt();

    if(num >= 1 && num <= 7){
        if(num==1){
            System.out.println("Monday");
        }else if(num ==2){
            System.out.println("tuesday");

        }else if(num==3){
            System.out.println("wednesday");
        }else if(num==4){
            System.out.println("thrusday");
        }else if(num==5){
            System.out.println("Friday");
        }else if(num==6){
            System.out.println("Saturday");
        }else{
            System.out.println("sunday");
        }
    }else{
        System.out.println("Given only week number form 1 to 7");
    }
            scn.close();

}
}
