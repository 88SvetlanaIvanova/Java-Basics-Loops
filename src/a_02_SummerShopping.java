import java.util.Scanner;

public class a_02_SummerShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = scan.nextInt();
        double blanketCost = scan.nextDouble();
        double discountPercent = scan.nextDouble();

        double umbrellaCost = blanketCost*2/3*1.0;
        double slippersCost = umbrellaCost*0.75;
        double bagCost =(slippersCost+blanketCost)*1/3*1.0;
        double totalCost =(blanketCost+umbrellaCost+slippersCost+bagCost)-(blanketCost+umbrellaCost+slippersCost+bagCost)*discountPercent/100.0;

        if(budget>=totalCost){
            double change = budget - totalCost;
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", totalCost, change);
        }else {
            double change = totalCost - budget;
            System.out.printf(	"Annie's sum is %.2f lv. She needs %.2f lv. more.", totalCost,change);
        }


    }
}
