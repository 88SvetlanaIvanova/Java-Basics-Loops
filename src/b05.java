import java.sql.SQLOutput;
import java.util.Scanner;

public class b05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        String password = "";
        for (int i1 = 1; i1 <number1 ; ++i1) {
            for (int j2 = 1; j2 <number1 ; j2++) {
                for (char k3 = 'a'; k3 <'a' + number2 ; k3++) {
                    for (char l4 = 'a'; l4 < 'a'+number2 ; l4++) {
                        for (int m5 = 2; m5 <=number1 ; m5++) {
                            if(m5>i1 && m5>j2){
                                System.out.printf("%d%d%s%s%d ",i1,j2,k3,l4,m5);
                            }
                            
                        }
                        
                    }

                }

            }



        }

    }
}
