import java.util.Scanner;

public class c_09SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum =0;

        do {
            sum = sum + (n%10);
            n= n / 10;     //n % 10: връща последната цифра на числото n.
        }while (n>0);     //n / 10: изтрива последната цифра на n.
        System.out.println("Sum of digits: " +  sum);
    }
}


