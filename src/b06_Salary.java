import java.util.Scanner;

public class b06_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int numberTabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        int facebook =150;
        int instagram = 100;
        int reddit = 50;
        String lost = "You have lost your salary.";
        //int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= numberTabs; i++) {
            String input = scan.nextLine().toLowerCase();

            switch (input) {
                case "facebook":
                    salary -= facebook;
                    break;
                case "instagram":
                    salary -= instagram;
                    break;
                case "reddit":
                    salary -= reddit;
                               }
            if(salary<=0){
                System.out.println(lost);
                return;
            }

        }
        if(salary>=0) {
            System.out.println(salary);
        }

    }
}
