package ifelseprogram;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%2==0){
            System.out.println(a + " is Even number");
        }else{
            System.out.println(a + " is Odd number");
        }

                scn.close();

    }
    
}
