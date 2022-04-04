import java.util.Scanner;

public class b_03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int mums =Integer.parseInt(scanner.nextLine());
        int rose =Integer.parseInt(scanner.nextLine());
        int tulipa =Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        String dayType = scanner.nextLine().toLowerCase();
        double cost=0;
        switch (season){
            case"spring": case"summer" :
                cost+=mums*2.0+rose*4.10+tulipa*2.50;
                break;
            case "autumn": case "winter":
                cost+=mums*3.75+rose*4.50+tulipa*4.15;
                break;
        }
        if(dayType.equals("y")){
            cost*=1.15;
        }
        if(season.equals("spring")&& tulipa>=7){
            cost*=0.95;
        }
        if(season.equals("winter")&& rose>=10){
            cost*=0.90;
        }
        if((mums+rose+tulipa)>=20){
            cost*=0.80;
        }
        double totalCost = cost+2;
        System.out.print(String.format("%.2f", totalCost));

    }
}
