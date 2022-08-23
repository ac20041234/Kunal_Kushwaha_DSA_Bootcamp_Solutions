package First_Java;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        // to print the fibonacci series , take the input from the user to print the fibonacci series upto that number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int sum = 0;

        //now using the for loop to print the further part of the fibonacci series
        for(int i = 2; i<=n;i++){
           sum = a + b ;
            System.out.println(sum);
            a = b;//this process is called Swapping
            b = sum;//dry run this code , in order to understand it in much better way
        }
    }
}
