import java.util.Scanner;

public class b03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int primeSum = 0;
        int nonprimeSum = 0;

        while (!"stop".equals(input)) {
            int currentNum = Integer.parseInt(input);
            boolean isPrime = true;
            if (currentNum == 1) {
                isPrime = false;
            }

            if (currentNum < 0) {
                System.out.println("Number is negative.");
            } else {

                for (int i = 2; i <= (currentNum / 2); ++i) {
                    // condition for nonprime number

                    if (currentNum % i == 0) {
                        isPrime = false;
                        break;


                    }
                }
                if (isPrime) {
                    primeSum += currentNum;
                } else {
                    nonprimeSum += currentNum;
                }

            }
            input = scan.nextLine();


        }


        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonprimeSum);
    }
}
