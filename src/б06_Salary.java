import java.util.Scanner;

public class б06_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int numberTabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        int remainder =0;
        String lost = "You have lost your salary.";
        //int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= numberTabs; i++) {

           while(salary > 0){

               String input = scan.nextLine().toLowerCase();
               if (input.equals("facebook")){
                   salary -=150;

               }
               if (input.equals("instagram")){
                   salary -=100;

               }
               if (input.equals("reddit")){
                   salary -= 50;

               }

           }



        }
        if(salary>0){
            System.out.println(salary);
        }else System.out.println(lost);

    }
}
