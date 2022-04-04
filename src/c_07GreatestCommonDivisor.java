import java.sql.SQLOutput;
import java.util.Scanner;

public class c_07GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        while (b !=0){
            int oldB = b;
            b= a%b;
            a= oldB;
        }
        System.out.println("GCD = " + a);


    }
}
