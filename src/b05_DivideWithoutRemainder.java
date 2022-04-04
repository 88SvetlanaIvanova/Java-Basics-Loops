import java.util.Scanner;

public class b05_DivideWithoutRemainder {
    public static void main(String[] args) {
        //variables to save percentage groups
        double p1Percentage = 0;
        double p2Percentage = 0;
        double p3Percentage = 0;

        //variables that save number of numbers in groups

        int cntP1 =0;
        int cntP2 =0;
        int cntP3 =0;

        Scanner scan = new Scanner((System.in));
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if (currentNumber % 2 ==0){
                cntP1++;
            }
            if (currentNumber % 3 ==0 ){
                cntP2++;
            }
            if(currentNumber % 4 == 0) {
                cntP3++;
            }

        }

        p1Percentage = cntP1 * 100.0 /n;
        p2Percentage = cntP2 * 100.0 /n;
        p3Percentage = cntP3 * 100.0 /n;
        System.out.println(String.format("%.2f%%",p1Percentage));
        System.out.println(String.format("%.2f%%",p2Percentage));
        System.out.println(String.format("%.2f%%",p3Percentage));
    }
}
