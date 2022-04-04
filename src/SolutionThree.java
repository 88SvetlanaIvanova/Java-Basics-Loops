import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input for centerX1
        int centerX1 = in.nextInt();

        // input for centerY1
        int centerY1 = in.nextInt();

        // input for radius1
        int radius1 = in.nextInt();

        // input for centerX2
        int centerX2 = in.nextInt();

        // input for centerY2
        int centerY2 = in.nextInt();

        // input for radius2
        int radius2 = in.nextInt();


        double result = areaOfIntersection(centerX1, centerY1, radius1, centerX2, centerY2, radius2);
        System.out.print(result);
    }

    public static double areaOfIntersection(int centerX1, int centerY1, int radius1, int centerX2, int centerY2, int radius2) {
        double answer = 0;
        long alpha, beta, a1, a2;
        // Write your code here
        double Pi = 3.14;
        double distanceBetwCirclesSq = (centerX1 - centerX2) * (centerX1 - centerX2) +
                (centerY1 - centerY2) * (centerY1 - centerY2);
        double sumRadSq = (radius1 + radius2) * (radius1 + radius2);
        if (distanceBetwCirclesSq > sumRadSq) {
            answer = 0;
        } else if (distanceBetwCirclesSq <= Math.abs(radius2 - radius1) && radius1 >= radius2) {
            answer = Pi * radius2 * radius2;
        } else if (distanceBetwCirclesSq <= Math.abs(radius2 - radius1) && radius2 >= radius1)
            answer = Pi * radius1 * radius1;
        else {
            alpha = (long) (Math.acos((radius1 * radius1 + distanceBetwCirclesSq *
                                distanceBetwCirclesSq - radius2 * radius2) / (2 * radius1 * distanceBetwCirclesSq)) * 2);
            beta = (long) Math.acos((radius2 * radius2 + distanceBetwCirclesSq *
                    distanceBetwCirclesSq - radius1 * radius1) / (2 * radius2 * distanceBetwCirclesSq)) * 2;
            a1 = (long) (0.5 * beta * radius2 * radius2 - 0.5 * radius2 * radius2 * Math.sin(beta));
            a2 = (long) (0.5 * alpha * radius1 * radius1 - 0.5 * radius1 * radius1 * Math.sin(alpha));
            answer = (a1 + a2);

             }
            return answer;
        }

}
