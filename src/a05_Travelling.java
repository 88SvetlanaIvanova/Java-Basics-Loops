import java.util.Scanner;

public class a05_Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();

        while( !destination.equals("End")){
            double budget = Double.parseDouble(scan.nextLine());
            double savedMoney = 0;

            while(savedMoney<budget) {
                double currentSum = Double.parseDouble(scan.nextLine());
                savedMoney+= currentSum;
            }
            if (savedMoney >= budget){
                System.out.printf("Going to %s!%n", destination);
            }
            destination = scan.nextLine();



        }


    }

}

