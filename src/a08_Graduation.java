import java.util.Scanner;

public class a08_Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  name = scan.nextLine();
        int counter = 1;
        double sum = 0;

        int excluded = 0;
        while (counter<=12){
            double grade = Double.parseDouble(scan.nextLine());
            if(grade>= 4){
                sum += grade;
            }
            else {
           // if( excluded>1){
               System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }
            counter ++;
            }

        if(counter >= 12) {double average = sum /12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }

    }

}



