import java.util.Scanner;

public class b04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int juryNum = Integer.parseInt(scan.nextLine());
        String presentation = scan.nextLine();

        double averageGrade =0;
        double gradeCounter =0;
        double counter = 0;
        double sumGrades = 0;
        double allGrades = 0;

        while(!"Finish".equals(presentation)){
            sumGrades = 0;
            for (gradeCounter = 1.00; gradeCounter <=juryNum ; gradeCounter++) {
                double grade = Double.parseDouble(scan.nextLine());

                allGrades += grade;
                sumGrades += grade;
                counter++;
                if(gradeCounter == juryNum){
                    averageGrade = sumGrades/juryNum*1.0;
                    break;
                }
            }
            if(!"Finish".equals(presentation)){
                System.out.printf("%s - %.2f.%n", presentation, averageGrade);
            }
            presentation = scan.nextLine();
        }
        if("Finish".equals(presentation)) {
            double averageResult = allGrades / counter;
            System.out.printf("Student's final assessment is %.2f.\n", averageResult);
        }
    }
}
