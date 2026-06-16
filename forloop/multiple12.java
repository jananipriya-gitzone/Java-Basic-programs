//sum of multiple of 3 between 11 to 20
package forloop;

public class multiple12 {
    public static void main(String[] args) {
        int sum = 0; 
        for (int i=11;i<=20;i++){
            if (i%3==0){
                sum= sum+i;
            }
            
        }
        System.out.println(sum);
        
    }
    
}
