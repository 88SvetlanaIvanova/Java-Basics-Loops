import java.util.Scanner;

public class a_04DartsTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int pointsOriginal = Integer.parseInt(scan.nextLine());
        int movesCount=0;


        while(pointsOriginal>0 ){
            String sectorTarget = scan.nextLine();
            movesCount++;
           if(sectorTarget.equals("bullseye")) {
               System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", movesCount);break;
           }
            int numberOfPoints =  Integer.parseInt(scan.nextLine());
            //pointsOriginal=0;
            switch (sectorTarget) {
                case "number section" : {
                    pointsOriginal -= numberOfPoints;
                    break;
                }
                case "double ring" : {
                    pointsOriginal -= numberOfPoints * 2;
                    break;
                }
                case "triple ring" : {
                    pointsOriginal -= numberOfPoints * 3;break;
                }

            }



        }
        if(pointsOriginal<0){
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(pointsOriginal));
        }else if(pointsOriginal==0){
            System.out.printf("Congratulations! You won the game in %d moves!",movesCount);
        }


    }
}
