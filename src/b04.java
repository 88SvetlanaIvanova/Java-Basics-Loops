import java.util.Scanner;

public class b04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfJudges = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double finalAssessment = 0;
        double countOfCourses = 0;
        while(!"Finish".equals(input)) {
            countOfCourses++;
            double resultsForThisCourse = 0;
            double averageResultsForThisCourse = 0;
            for (int currentJudge = 0; currentJudge < numberOfJudges; currentJudge++) {
                double currentMark = Double.parseDouble(scan.nextLine());
                resultsForThisCourse += currentMark;
            }
            averageResultsForThisCourse = resultsForThisCourse / numberOfJudges;
            finalAssessment+=averageResultsForThisCourse;
            System.out.printf("%s - %.2f.%n", input, averageResultsForThisCourse);
            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.\n", finalAssessment/countOfCourses);


    }
}
