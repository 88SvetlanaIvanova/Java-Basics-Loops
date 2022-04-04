import java.util.Scanner;

public class b02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            int number =  Integer.parseInt(scan.nextLine());
            sum += number;
            if(number > max){
                max = number;
            }
        }
        int sumWithoutMaxNumber = sum - max;
        if(sumWithoutMaxNumber == max ){
          //System.out.println("");
          System.out.println("Yes\nSum = "+ max);
        }else{
            int diff = Math.abs(max - sumWithoutMaxNumber);
            System.out.println("No\nDiff = " + diff);

        }


    }
}
