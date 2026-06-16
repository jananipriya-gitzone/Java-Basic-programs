//sum of all even number between 1 to 4
package forloop;

public class sum11 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 4; i++) {
            if(i%2==0){
            sum += i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}