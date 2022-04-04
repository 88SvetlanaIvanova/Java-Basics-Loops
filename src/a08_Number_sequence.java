import java.util.Scanner;

public class a08_Number_sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if(num>maximum){
                maximum = num;
            }
            if (num<minimum){
                minimum = num;
            }
        }
        System.out.println("Max number: " + maximum);
        System.out.println("Min number: " + minimum);

    }
}
