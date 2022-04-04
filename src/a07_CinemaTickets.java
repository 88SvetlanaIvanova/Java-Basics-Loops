import java.util.Scanner;

public class a07_CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filmTitle = scan.nextLine();

        int students = 0;
        int standard = 0;
        int kids = 0;
        int countAllTickets = 0;

        while (!"Finish".equals(filmTitle)) {

            int seatsNum = Integer.parseInt(scan.nextLine());
            String ticketType = scan.nextLine();
            double totalTickets = 0;
            while (!"End".equals(ticketType)) {

                switch (ticketType) {
                    case "student":
                        students++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                countAllTickets++;
                totalTickets++;
                if ((totalTickets == seatsNum)) {
                    break;
                }
                ticketType = scan.nextLine();


            }

            /*for (int i = 0; i <=seatsNum ; i++) {


                switch(ticketType){
                    case "student":
                        students+=1; numTickets++;
                        totalTickets++;
                        break;
                    case "standard":
                        standard+=1; numTickets++;
                        totalTickets++;
                        break;
                    case "kid":
                        kids += 1; numTickets++;
                        totalTickets++;
          %2              break;
                }
                if (seatsNum<=numTickets|| "End".equals(ticketType) ) {
                    break;
                }
                ticketType = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n",filmTitle,(numTickets/seatsNum)*100);*/
            double filmPercent = (totalTickets / seatsNum) * 100.0;
            System.out.printf("%s - %.2f%% full.\n", filmTitle, filmPercent);

            filmTitle = scan.nextLine();


        }

        System.out.printf("Total tickets: %d\n", countAllTickets);
        System.out.printf("%.2f%% student tickets.\n", (students * 1.0 / countAllTickets) * 100);
        System.out.printf("%.2f%% standard tickets.\n", (standard * 1.0 / countAllTickets) * 100);
        System.out.printf("%.2f%% kids tickets.\n", (kids * 1.0 / countAllTickets) * 100);


    }
}

