package First_Java;
import java.util.*;
public class armstrongNumber {
    public static void main(String[] args) {
        //print the armstrong number(s) between the two numbers.

        Scanner sc = new Scanner(System.in);
        for (int i = 100; i<= 1000;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10 ;
            n = n /10;
            int cube = rem * rem * rem ;
            sum =  sum + cube;
        }
        if(original == sum){
            return true;
        }else{
            return false;
        }
    }
}