package First_Java;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        //Take the input from the user and print it out whether it is even or odd
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 ==0){
            System.out.println(" the number " + n + " is an even number ");
        }else{
            System.out.println(" the number " + n + " is not an even number");
        }
    }
}
