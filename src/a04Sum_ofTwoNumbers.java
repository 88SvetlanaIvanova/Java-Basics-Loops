import java.util.Scanner;

public class a04Sum_ofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = Integer.parseInt(scan.nextLine());
        int endNum = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int combinations = 0;
        boolean flag = false;
        for (int i = startNum; i <= endNum ; i++) {
            for (int j = startNum; j <= endNum ; j++) {
                combinations++;
                if(i + j == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinations,i,j,magicNum);
                    flag = true;
                    break;
                }
            }
            if(flag) break;

        }
        if(!flag){
            System.out.printf("%d combinations - neither equals %d", combinations, magicNum);

        }


    }
}
