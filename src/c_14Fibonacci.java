import java.util.Scanner;

public class c_14Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());
        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i <n-1 ; i++) {
            int nF = f0+f1;
            f0 = f1;
            f1= nF;
        }
        System.out.println(f1);
    }
}
