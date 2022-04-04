import java.util.Scanner;

public class a06_Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());
        char symbol=' ';

        for (int i = floors; i >0 ; i--) {
            for (int j = 0; j <rooms ; j++) {
                if(i==floors){
                  symbol = 'L';
                }
                else if(i % 2== 0){
                    symbol = 'O';
                } else //(i % 2 != 0)
                {
                    symbol = 'A';
                }
                System.out.printf("%c%d%d ", symbol,i,j);

            }
            System.out.println();
        }


    }
}
