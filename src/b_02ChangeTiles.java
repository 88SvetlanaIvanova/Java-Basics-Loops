import java.util.Scanner;

public class b_02ChangeTiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double collectedMoney = Double.parseDouble(scan.nextLine());
        double floorWidth = Double.parseDouble(scan.nextLine());
        double floorLength = Double.parseDouble(scan.nextLine());
        double triangleSide = Double.parseDouble(scan.nextLine());
        double triangleHeight = Double.parseDouble(scan.nextLine());
        double tileCost = Double.parseDouble(scan.nextLine());
        double sumForWork = Double.parseDouble(scan.nextLine());


        double floorArea = floorWidth*floorLength;
        double tileArea = triangleSide*triangleHeight/2;
        double numberOfTiles = Math.ceil(floorArea/tileArea)+5;
        double totalSum = numberOfTiles*tileCost+sumForWork;


        if(collectedMoney >= totalSum) {
            double extraMoney = collectedMoney - totalSum;
            System.out.print(String.format("%.2f lv left.", extraMoney));
        }else {
            double lessMoney = totalSum - collectedMoney;
            System.out.printf("You'll need %.2f lv more.", lessMoney);
        }
    }
}
