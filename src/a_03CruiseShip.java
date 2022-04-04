import java.util.Scanner;

public class a_03CruiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String cruiseType = scanner.nextLine();
        String chamberType = scanner.nextLine().toLowerCase();
        int nights = Integer.parseInt(scanner.nextLine());
        //за повече от 7 нощувки има 25% отстъпка.
        double discount =0.25;
        double vacationCost =0;
        switch(cruiseType){
            case"Mediterranean":
                if (chamberType.equals("standard cabin")){
                    vacationCost=4*nights*27.50;
                } else if(chamberType.equals("cabin with balcony")){
                    vacationCost=4*nights*30.20;
                }else if(chamberType.equals("apartment")){
                    vacationCost=4*nights*40.50;
                }break;
            case "Adriatic":
                if (chamberType.equals("standard cabin")){
                    vacationCost=4*nights*22.99;
                } else if(chamberType.equals("cabin with balcony")){
                    vacationCost=4*nights*25.00;
                }else if(chamberType.equals("apartment")){
                    vacationCost=4*nights*34.99;
                }break;
            case "Aegean":
                if (chamberType.equals("standard cabin")){
                    vacationCost=4*nights*23.00;
                } else if(chamberType.equals("cabin with balcony")){
                    vacationCost=4*nights*26.60;
                }else if(chamberType.equals("apartment")){
                    vacationCost=4*nights*39.80;
                }break;

        }
        if(nights>7){
            vacationCost*=0.75;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruiseType, vacationCost);
    }
}
