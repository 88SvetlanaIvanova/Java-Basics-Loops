import java.util.Scanner;

public class a_05CruiseGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String playersName = scanner.nextLine();
        int numberOfGames = Integer.parseInt(scanner.nextLine());
        int tennisGames =0; int volleyballGames=0; int badmGames = 0;
        double pointsAverageVolleyball =0;
        double pointsAverageTennis =0;
        double pointsAverageBadminton =0;
        double sumPoints = 0;
        double VolleyPointsSum = 0;
        double tennisPointsSum = 0;
        double badmintonPointsSum = 0;
        //За всяка една игра се четат по два реда:

        //"volleyball" *7%, "tennis"*5%, "badminton"*2%

        for (int i = 0; i <numberOfGames ; i++) {
            String gameType = scanner.nextLine().toLowerCase();
            double pointsGained = Double.parseDouble(scanner.nextLine());
            switch (gameType){
                case "volleyball":
                    VolleyPointsSum+=pointsGained*1.07;
                    volleyballGames++;
                    break;
                case "tennis":
                    tennisPointsSum+=pointsGained*1.05;
                    tennisGames++;
                    break;

                case  "badminton":
                    badmintonPointsSum+= pointsGained*1.02;
                    badmGames++;
                    break;

            }
        }
        pointsAverageVolleyball=(int) Math.floor(VolleyPointsSum/volleyballGames);
        pointsAverageTennis = (int) Math.floor(tennisPointsSum/tennisGames);
        pointsAverageBadminton =(int) Math.floor(badmintonPointsSum/badmGames);
        sumPoints = (int) Math.floor(VolleyPointsSum+tennisPointsSum+badmintonPointsSum);
        if(pointsAverageBadminton>=75 && pointsAverageTennis>=75 && pointsAverageVolleyball>=75){
            System.out.print(String.format("Congratulations, %s! You won the cruise games with %.0f points.", playersName,sumPoints));
        }else {
            System.out.print(String.format("Sorry, %s, you lost. Your points are only %.0f.", playersName,sumPoints));
        }

    }
}
