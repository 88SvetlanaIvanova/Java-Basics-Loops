import java.util.Scanner;

public class c_03_PowersofTwo {//Java-Book 7.1. Complex Loops

    public static void main(String[] args) {
        //Да се напише програма, която отпечатва числата от 1 до 2^n (две на степен n).
        // Например, ако n = 10, то резултатът ще е 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024.
        Scanner scan = new Scanner((System.in));
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        for (int i = 0; i <=n ; i++) {
            System.out.println(num);
            num = num*2;
        }
    }
}
