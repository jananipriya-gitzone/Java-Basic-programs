//Fahrenheit to Celsius Conversion Program in Java    ((Fahrenheit-32)*5)/9

package ifelse;
import java.util.Scanner;
public class java14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        double celsius , fahrenheit;
        fahrenheit = scn.nextDouble();
        celsius = ((fahrenheit - 32)*5)/9;
        System.out.println("fahrenheit to Celsius value is : " + celsius);

                scn.close();

    }
    
}