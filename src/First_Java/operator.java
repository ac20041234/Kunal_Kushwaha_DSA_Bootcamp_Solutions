package First_Java;
import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take two numbers as an input from the user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int z = sc.nextInt();

        //now , use the switch statement for making the use of the operators
        switch (z){
            case 1:
                System.out.println(" the sum is : " + (n1+n2));
                break;
            case 2 :
                System.out.println(" the Difference is  : " + (n1 -n2));
                break;
            case 3 :
                System.out.println(" the product is : " + (n1 * n2));
                break;
            case 4 :
                if( n2 ==0 ){
                    System.out.println("Invalid divison");
                }else{
                    System.out.println(" the divison is : " + (n1 / n2));
                }
            default:
                System.out.println("Invalid operator");

        }

    }
}
