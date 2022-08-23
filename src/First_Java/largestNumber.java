package First_Java;
import java.util.*;
public class largestNumber {
    public static void main(String[] args) {
        //take two numbers input from the user using the Scanner class
        Scanner sc = new  Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println(n1 + "  is larger than  " + n2 );
        }else{
            System.out.println(n1 + "  is smaller than  " + n2);
        }
    }
}
