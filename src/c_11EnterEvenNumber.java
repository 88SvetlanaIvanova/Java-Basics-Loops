import java.util.Scanner;

public class c_11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =0;
        while (true){
            System.out.println("Enter even number: ");
            n = Integer.parseInt(scan.nextLine());
         if (n % 2 == 0){
             break;
         }
            System.out.println("The number is not even.");
        }
        System.out.printf("Even number entered: %d. ", n);
    }
}
