import java.text.DecimalFormat;
import java.util.Scanner;

class b03_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int n = Integer.parseInt(scan.nextLine());
        double oddSum = 0;
        double oddMin = 1000000000000.0;
        double oddMax = -1000000000000.0;
        double evenSum = 0;
        double evenMin = 1000000000000.0;
        double evenMax = -1000000000000.0;
       // DecimalFormat df = new DecimalFormat("#.##");


        for (int i = 1; i <=n ; i++) { //even numbers
            double num =  Double.parseDouble(scan.nextLine());

            if(i % 2 == 0){
                evenSum += num;
                if(num>evenMax){
                    evenMax = num;
                }
                if(num<evenMin){
                    evenMin = num;
                }
            }
            else { // odd numbers
                oddSum += num;
                if(num>oddMax){
                    oddMax = num;
                }
                if(num<oddMin){
                    oddMin = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n",oddSum);
       // System.out.println("OddSum=" + df.format(oddSum));


        if(oddMin ==1000000000000.0){
            System.out.println("OddMin=No,");
        }else{
            System.out.printf("OddMin=%.2f,\n",oddMin);
        }
        if(oddMax == -1000000000000.0 ){
            System.out.println("OddMax=No,");
        }else{
            System.out.printf("OddMax=%.2f,\n",oddMax);

        }

        System.out.printf("EvenSum=%.2f,\n",evenSum);
        if(evenMin ==1000000000000.0){
            System.out.println("EvenMin=No,");
        }else{
            System.out.printf("EvenMin=%.2f,\n",evenMin);
        }
        if(evenMax == -1000000000000.0 ){
            System.out.println("EvenMax=No");
        }else{
            System.out.printf("EvenMax=%.2f\n",evenMax);

        }







    }
}
