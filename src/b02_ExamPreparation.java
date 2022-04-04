import java.util.Scanner;

public class b02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scan.nextLine());
        int countPoorMarks = 0;
        int doneTasks = 0;
        int sumGrade = 0;
        String currentTask = "";
        boolean failed = true;

        while(failedThreshold> countPoorMarks){
            String taskName = scan.nextLine();
            if("Enough".equals(taskName)){
                failed = false; break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            if(grade <=4){
                countPoorMarks++;
            }
            sumGrade += grade;
            doneTasks++;
            currentTask = taskName;

        }
        double average = (double) sumGrade/ doneTasks;
        if (failed){
            System.out.printf("You need a break, %d poor grades.", failedThreshold);
        }else{
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n", doneTasks);
            System.out.printf("Last problem: %s", currentTask);
        }


    }
}
