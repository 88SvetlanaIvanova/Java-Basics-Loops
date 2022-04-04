import java.util.Scanner;

public class c_06Logistics {//5.2. Loops - Exam Problems

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTheGoods = Integer.parseInt(scanner.nextLine());
        double sumOfTons =0;
        int busTons =0;
        int truckTons =0;
        int trainTons =0;

        double busTransfer =0;
        double truckTransfer = 0;
        double trainTransfer = 0;
        double totalPrice = 0;
        double averagePrice =0;
        for (int i = 0; i <=numberOfTheGoods - 1 ; i++) {
            int tonsOfTheGoods = Integer.parseInt(scanner.nextLine());
            sumOfTons +=tonsOfTheGoods;
            if(tonsOfTheGoods<=3){
                busTons+=tonsOfTheGoods;
            }else if (tonsOfTheGoods > 3&&tonsOfTheGoods <= 11){
                truckTons+=tonsOfTheGoods;
            }else if(tonsOfTheGoods>11){
                trainTons+=tonsOfTheGoods;
            }

        }//Накрая ще пресметнем и отпечатаме общата средна цена на тон и каква част от товара е превозена с всеки вид транспорт процентно.
        busTransfer =  (busTons*100/sumOfTons*1.0);
        truckTransfer = truckTons*100/sumOfTons*1.0;
        trainTransfer = trainTons*100/sumOfTons*1.0;
        totalPrice = (busTons*1.0*200) + (1.0*truckTons*175) + (1.0*trainTons*120);
        averagePrice = totalPrice*1.0/sumOfTons*1.0;
        System.out.println();
        System.out.printf("%.2f%n", averagePrice);
        //System.out.printf("%.2f%n%.2f%n%.2f%n ", busTransfer, truckTransfer, trainTransfer);
        System.out.println(String.format("%.2f%%",busTransfer));
        System.out.println(String.format("%.2f%%",truckTransfer));
        System.out.println(String.format("%.2f%%",trainTransfer));


    }
}
