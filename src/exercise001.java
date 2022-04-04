import java.util.Arrays;
import java.util.Scanner;

public class exercise001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for orderID
        int orderID_size = in.nextInt();
        int[] orderID = new int[orderID_size];
        for(int idx = 0; idx < orderID_size; idx++)
        {
            orderID[idx] = in.nextInt();
        }
        int[]  answer = prodDelivery(orderID);
        for (int i = 0; i < orderID_size -1 ; i++) {
            System.out.print(answer[i] + " " );
        }
        System.out.print(answer[orderID_size +1]);


    }
    public static int[]  prodDelivery(int[] orderID)
    {

        int[]  answer = new int[100];
        // Write your code here
        int digit, number, temp = 0;
        for (int i = 0; i < orderID.length; i++) {
            number = orderID[i];
            while (number > 0){
                digit = number % 10;
                temp += digit;
                number /= 10;

            }
            answer[i] = temp;
            temp = 0;

        }


        return answer;
    }

}
