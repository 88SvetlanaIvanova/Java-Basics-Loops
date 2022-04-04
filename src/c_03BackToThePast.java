import java.util.Scanner;

public class c_03BackToThePast {
    public static void main(String[] args) {
        //Java-Book 5.2. Loops - Exam Problems
        Scanner scanner = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearsToLive_InThePast = Integer.parseInt(scanner.nextLine());
        int age = 18;
        double extraMoney = 0;
        //System.out.printf("Yes! He will live a carefree life and will have %d dollars left.", extraMoney);
        //System.out.printf("He will need %d dollars to survive.");
        for (int currentYear = 1800; currentYear <=yearsToLive_InThePast ; currentYear++) {
            if(currentYear % 2 == 0){
                inheritedMoney -= 12000;
            }else{
                inheritedMoney -= (12000 + 50 * age);
            }
            age++;

        }
        if(inheritedMoney >= 0){

            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        }else{
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }


    }
}
