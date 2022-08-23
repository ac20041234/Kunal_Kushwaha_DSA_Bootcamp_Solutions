package First_Java;
import java.util.*;
public class CurrencyInUSD {
    public static void main(String[] args) {
        //take the input from the user in rupees, convert and then print it out in USD
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the currency into Indian rupees  : " );
        double rupees = sc.nextDouble();

        double USD = rupees / 80;
        System.out.println(" the total amount in USD is : " + USD);

    }
}
