import java.util.Scanner;

public class b02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        for (int i = n1; i <= n2; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            int copyNum = i;
            boolean isEvenPosition = true;
            while (copyNum > 0){
                int currentDigit = copyNum % 10;
                copyNum = copyNum / 10;
                if(isEvenPosition){
                    evenSum+= currentDigit;
                }else{
                    oddSum += currentDigit;
                }
                isEvenPosition  = !isEvenPosition;
            }
            /*
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                        //char currrentDigit = currentNum.charAt(j);
                       //int digitAsInteger = Integer.parseInt(currentDigit+ "")
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

            }*/


            if (oddSum == evenSum) {
                System.out.printf( "%d ",i);
            }


        }

    }
}
