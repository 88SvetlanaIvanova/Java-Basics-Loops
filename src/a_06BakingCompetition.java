import java.util.Scanner;

public class a_06BakingCompetition {
    public static void main(String[] args) {
        //сладки - 1,50, торти - 7,80, гофрети - 2,30
        // кои сладкиши е изпекъл всеки един от участниците, колко е общият брой
        // на продадените сладкиши и колко е събраната сума за благотворителност.
        int totalSweetsSold = 0;
        double charitySum = 0;
        Scanner scanner = new Scanner((System.in));
        int numberOfParticipants = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfParticipants ; i++) {
            int cookies =0;
            int cakes = 0;
            int waffles =0;
            String inputName =scanner.nextLine();

           while(true){
               String sweetsName = scanner.nextLine();
           if("Stop baking!".equals(sweetsName)){
               System.out.print(String.format("%s baked %d cookies, %d cakes and %d waffles.\n", inputName,cookies,cakes, waffles));
               break;
           }
               int numberOfSweets = Integer.parseInt(scanner.nextLine());
                totalSweetsSold+=numberOfSweets;
                switch (sweetsName){
                    case "cookies":
                        cookies+=numberOfSweets;
                        charitySum+=numberOfSweets*1.5;
                        break;
                    case "cakes":
                        cakes+=numberOfSweets;
                        charitySum+=numberOfSweets*7.80;
                        break;
                    case "waffles":
                        waffles+=numberOfSweets;
                        charitySum+=numberOfSweets*2.30;
                        break;

                }
           }

        }
        System.out.print(String.format("All bakery sold: %d\n",totalSweetsSold));
        System.out.print(String.format("Total sum for charity: %.2f lv.\n",charitySum));


    }
}
