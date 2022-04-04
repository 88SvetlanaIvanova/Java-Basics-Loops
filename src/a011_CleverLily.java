import java.util.Scanner;

public class a011_CleverLily {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int age = Integer.parseInt(scan.nextLine());
        double wMachinePrice = Double.parseDouble(scan.nextLine());
        int toyCost = Integer.parseInt(scan.nextLine());

        int numberOfToys = 0;
        int savedMoney = 0;
        int moneyPresent = 10;

        for (int currentYear = 1; currentYear <= age ; currentYear++) {
            if(currentYear % 2 ==0 ){
                savedMoney += (moneyPresent - 1);
                moneyPresent += 10;
            }else{
                numberOfToys++;
            }
        }
        savedMoney += numberOfToys * toyCost;
        System.out.println((savedMoney >= wMachinePrice ?
                String.format("Yes! %.2f", (savedMoney - wMachinePrice))
                : String.format("No! %.2f",(wMachinePrice - savedMoney))));




    }
}

