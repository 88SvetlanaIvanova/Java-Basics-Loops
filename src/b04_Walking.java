import java.util.Scanner;

public class b04_Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goal = false;
        int stepsCounter = 0;
        String input = scan.nextLine();
        while(goal || !input.equals("Going home")){
            int currentSteps = Integer.parseInt(input);
            stepsCounter += currentSteps;
            if(stepsCounter >= 10000){
                goal = true; System.out.printf("Goal reached! Good job!\n");
                int stepsLeft = stepsCounter - 10000;
                if(stepsLeft>0){
                    System.out.printf("%d steps over the goal!",stepsLeft);
                }break;
            }
            input = scan.nextLine();
        }
        if(input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scan.nextLine());
            stepsCounter += stepsToHome;

            if(stepsCounter >= 10000){

                System.out.printf("Goal reached! Good job!\n");
                int stepsLeft = stepsCounter - 10000;
                if(stepsLeft>0){
                    System.out.printf("%d steps over the goal!",stepsLeft);
                }

            }else {
                int stepsLeft = 10000 - stepsCounter;
                System.out.printf("%d more steps to reach goal.", stepsLeft);
            }
        }

    }
}
