import java.util.Scanner;
import java.util.Spliterator;

public class b04_Histogram {
    public static void main(String[] args) {

        //variables to save percentage groups
        double p1Percentage = 0;
        double p2Percentage = 0;
        double p3Percentage = 0;
        double p4Percentage = 0;
        double p5Percentage = 0;

        //variables that save number of numbers in groups

        int cntP1 =0;
        int cntP2 =0;
        int cntP3 =0;
        int cntP4 =0;
        int cntP5 =0;

        Scanner scan = new Scanner((System.in));
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if (currentNumber< 200){
                cntP1++;
            }else if (currentNumber >= 200 && currentNumber<= 399){
                cntP2++;
            }else if(currentNumber >= 400 && currentNumber<= 599){
                cntP3++;
            }else if( currentNumber >= 600 && currentNumber<= 799){
                cntP4++;
            }else {
                cntP5++;
            }
        }
        p1Percentage = cntP1 * 100.0 /n;
        p2Percentage = cntP2 * 100.0 /n;
        p3Percentage = cntP3 * 100.0 /n;
        p4Percentage = cntP4 * 100.0 /n;
        p5Percentage = cntP5 * 100.0 /n;

        System.out.println(String.format("%.2f%%",p1Percentage));
        System.out.println(String.format("%.2f%%",p2Percentage));
        System.out.println(String.format("%.2f%%",p3Percentage));
        System.out.println(String.format("%.2f%%",p4Percentage));
        System.out.println(String.format("%.2f%%",p5Percentage));





















    }
}
