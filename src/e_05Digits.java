import java.util.Scanner;

public class e_05Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int onesOfTheN = n % 10;//132 % 10 = 2
        int tensOfN = (n % 100) / 10;//132% 100=32; 32/10= 3
        int hundredsOfN = n/100;//132/100 = 1
        int row = tensOfN + hundredsOfN;
        int cols = hundredsOfN + onesOfTheN;

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=cols ; j++) {
               if(n % 5 == 0) {
                   n = n - hundredsOfN;
                   System.out.print(n +" ");
               }else if(n % 3==0){
                   n= n - tensOfN;
                   System.out.print(n +" ");
               }else{
                   n= n +onesOfTheN;
                   System.out.print(n +" ");
               }
            }
            System.out.println();
        }


    }
}
