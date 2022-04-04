import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for errorScore
        int errorScore_size = in.nextInt();
        int[] errorScore = new int[errorScore_size];
        for(int idx = 0; idx < errorScore_size; idx++)
        {
            errorScore[idx] = in.nextInt();
        }
        // input for compP
        int compP = in.nextInt();

        // input for othQ
        int othQ = in.nextInt();


        int result = minProject(errorScore, compP, othQ);
        System.out.print(result);
    }
    public static int  minProject(int[] errorScore, int compP, int othQ)
    {
        int  answer = 0;
        // Write your code here
        //How many projects a team needs to complete to make the score 0

        // check the array if all elements are 0, until they are we reduse Pscore and TeaMS qSCORE
        while (!zeroErrorScoreReached(errorScore)){
            //They coml projects one by one. The error score is > 0
            for (int i = 0; i < errorScore.length; i++) {

                if (errorScore[i] - compP < 0){
                    errorScore[i] = 0;
                }else {
                    errorScore[i] -= compP;
                }
                for (int j = 0; j < errorScore.length; j++) {
                    if (j != i || errorScore[j] == 0){
                        if (errorScore[j]- othQ < 0){
                            errorScore[j] = 0;
                        }else {
                            errorScore[j] -= othQ;
                        }
                    }

                }

                answer++;
                if (zeroErrorScoreReached(errorScore)) {
                    break;
                }
            }

         }

        return answer;
    }

    public static boolean zeroErrorScoreReached(int[] errorScore){
        for (int i = 0; i < errorScore.length ; i++) {
            if (errorScore[i] != 0){
                return false;
            }
        }

        return true;
    }
}
