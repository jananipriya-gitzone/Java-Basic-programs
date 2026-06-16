//count of odd numbers between 1 to 5
package forloop;
public class count13{
    public static void main(String[] args) {
        int count =0;
        for (int i=1;i<=5;i++){
            if(i%2==1){
                count ++;
            }

        }
        System.out.println(count);

    }
}