//Celsius to Fahrenheit conversion program in Java (celsius * 9/5) + 32

package ifelseprogram;
import java.util.Scanner;
public class java13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double Celsius , fahrenheit;
        Celsius = scn.nextDouble();
        fahrenheit = (Celsius * 9/5)+32;
        System.out.println("Celsius to fahrenheit value is : " + fahrenheit);

                scn.close();

    }
    
}
