package First_Java;
import java.util.*;
public class inputNameGreeting {
    public static void main(String[] args) {
        //take an name as an input from the user and print it out the greetings associated with it
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println(" Hello,welcome onbaord " + name +" , We are happy to have you on our team");
    }
}
