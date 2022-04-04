import java.util.Scanner;

public class a05_AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input = scan.nextLine();
        double balance = 0;
        while (!input.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(input);
            if(amount<0){
                System.out.println("Invalid operation!");break;
            }
            balance += amount;
            System.out.printf("Increase: %.2f\n", amount);
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", balance);

    }
}
