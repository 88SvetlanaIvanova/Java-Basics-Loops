import java.util.Scanner;

public class a06_MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input = scan.nextLine();
        double max = -100000000000000.0;
        while (!input.equals("Stop")) {
            double amount = Double.parseDouble(input);
            if(amount> max){
                max = amount;
            }
            input = scan.nextLine();
        }
        int maxNum = (int)max;

        System.out.println(maxNum);
        }
}

