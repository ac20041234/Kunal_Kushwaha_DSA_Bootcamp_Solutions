package First_Java;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal , here : ");
        double principal = sc.nextDouble();
        System.out.println(" Enter the time , here :");
        double time = sc.nextDouble();
        System.out.println(" Enter the Rate , here : ");
        double rate = sc.nextDouble();

        // use the simple interest formula and calculate it's value
        double SimpleInterest = (principal * time * rate) / 100;
        System.out.println(" The simple interest is  : " + SimpleInterest);
    }
}
