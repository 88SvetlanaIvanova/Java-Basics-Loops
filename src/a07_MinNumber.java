import java.util.Scanner;

public class a07_MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input = scan.nextLine();
        double min = 100000000000000.0;
        while (!input.equals("Stop")) {
            double amount = Double.parseDouble(input);
            if(amount< min){
                min = amount;
            }
            input = scan.nextLine();
        }
        int minNum = (int)min;

        System.out.println(minNum);
    }
}
