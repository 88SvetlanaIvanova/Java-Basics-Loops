import java.util.Scanner;

public class c_04_Hostital {//Java-Book 5.2. Loops - Exam Problems
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalForCheckup = Integer.parseInt(scanner.nextLine());
        int checkedPatients = 0;
        int waitingPatients = 0;
        int countOfDoctors = 7;
       // System.out.printf("Treated patients: %d.");
       // System.out.printf("Untreated patients: %d.");
        // 7 doctors treat 7 patients per day, checkup is every 3rd day
        for (int day = 1; day <=intervalForCheckup; day++) {
            int numberOfPatientsPerDay = Integer.parseInt(scanner.nextLine());

            if ((day % 3 == 0) && (waitingPatients > checkedPatients)){
                countOfDoctors++;
            }
            if (numberOfPatientsPerDay>countOfDoctors){
                checkedPatients += countOfDoctors;
                waitingPatients += numberOfPatientsPerDay - countOfDoctors;
            }else{
                checkedPatients += numberOfPatientsPerDay;
            }


        }
        System.out.printf("Treated patients: %d.%n", checkedPatients);
        System.out.printf("Untreated patients: %d.", waitingPatients);




    }
}
