//count of multiple of 5  between 51 to 100
package forloop;
public class count14{
    public static void main(String[] args) {
        int count =0;
        for (int i=51;i<=100;i++){
            if(i%5==0){
                count ++;
            }

        }
        System.out.println(count);

    }
}