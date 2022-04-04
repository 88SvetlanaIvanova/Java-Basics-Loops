import java.util.Scanner;

public class b_04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        double TopStudentsPercentage = 0;
        double Between4and5_Percentage = 0;
        double Between3and4_Percentage = 0;
        double Failed_Percentage = 0;
        double totalResult =0;
        double AverageGrade = 0;
        int numberOfStudents =Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numberOfStudents ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalResult+=grade;
            if(grade < 3){
                Failed_Percentage++;
            }else if(grade>=3 && grade<4){
                Between3and4_Percentage++;
            }else  if(grade >=4 && grade <5){
                Between4and5_Percentage++;
            }else if(grade>=5){
                TopStudentsPercentage++;
            }
        }
        AverageGrade=totalResult/numberOfStudents*1.0;
        TopStudentsPercentage= TopStudentsPercentage*100/numberOfStudents*1.0;
        Between4and5_Percentage=Between4and5_Percentage*100/numberOfStudents*1.0;
        Between3and4_Percentage = Between3and4_Percentage*100/numberOfStudents*1.0;
        Failed_Percentage = Failed_Percentage*100/numberOfStudents*1.0;
        System.out.printf("Top students: %.2f%%\n", TopStudentsPercentage);

        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", Between4and5_Percentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", Between3and4_Percentage);
        System.out.printf("Fail: %.2f%%\n", Failed_Percentage);
        System.out.printf("Average: %.2f\n", AverageGrade);

    }
}
