import java.util.Scanner;

public class a09_LeftandRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long leftSum = 0;
        long rightSum = 0;
        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            leftSum += number;
                    }

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            rightSum += number;
        }
        if(leftSum==rightSum){
            System.out.println("Yes, sum = "+ leftSum);
        }else {
            long diff =rightSum - leftSum;
            diff = Math.abs(diff);
            System.out.println("No, diff = "+ diff);
        }

    }
}
