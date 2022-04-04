import java.util.Scanner;

public class b_01_Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedOriginal = scan.nextInt();
        int timeMinutesOne = scan.nextInt();
        int timeMinTwo = scan.nextInt();
        int timeMinThree = scan.nextInt();
        double distanceOne =0;
        double distanceTwo =0;
        double distanceThree = 0;
        double totalDistance=0;
        double speedTwo = speedOriginal*1.10;
        double speedThree = speedTwo*0.95;
        // За да намерите разстоянието трябва да превърнете минутите в часове
        distanceOne= speedOriginal*(timeMinutesOne/60.0);
        distanceTwo = speedTwo*(timeMinTwo/60.0);
        distanceThree = speedThree*(timeMinThree/60.0);
        totalDistance = distanceOne+distanceTwo+distanceThree;
        System.out.print(String.format("%.2f ",totalDistance));


    }
}
