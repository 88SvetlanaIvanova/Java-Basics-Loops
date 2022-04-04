import java.util.Scanner;

public class b03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vacationCost = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;
        //
       //
        while(budget < vacationCost && spendingCounter < 5){
            String  operation = scan.nextLine();
            double sumOperation = Double.parseDouble(scan.nextLine());
            daysCounter++;
            if("save".equals(operation)){
                budget += sumOperation;
                spendingCounter =0;
            }else if("spend".equals(operation)){
                budget -= sumOperation;
                spendingCounter+=1;
                if(budget < 0){
                    budget = 0;
                }
            }
        }
        if(spendingCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }if(budget >= vacationCost){
            System.out.printf("You saved the money for %d days.", daysCounter);

        }







    }
}
