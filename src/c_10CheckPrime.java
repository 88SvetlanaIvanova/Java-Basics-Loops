import java.util.Scanner;

public class c_10CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        boolean prime = n>=2;

        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
        System.out.println(Math.sqrt(n));
    }
}
