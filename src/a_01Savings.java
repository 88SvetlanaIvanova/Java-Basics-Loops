import java.util.Scanner;

public class a_01Savings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budgetPerMonth = scan.nextDouble();
        int numberOfMonths = scan.nextInt();
        double spendingPerMonth = scan.nextDouble();
        double savedMoney = (budgetPerMonth*0.7-spendingPerMonth)*numberOfMonths;
        double percentOfBudgetSaved = (budgetPerMonth*0.7-spendingPerMonth)/budgetPerMonth*100.0;


        System.out.println(String.format("She can save %.2f%%",percentOfBudgetSaved));
        System.out.printf("%.2f",savedMoney);


    }
}
