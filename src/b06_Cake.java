import java.util.Scanner;

public class b06_Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int cakeSize = width*length;
        int numPieces = cakeSize/1;

        boolean cakeIsLeft = true;
        //int piecesTaken = 0;
        String input = scan.nextLine().toUpperCase();
        while(!cakeIsLeft || !input.equals("STOP")){
            int piecesTaken = Integer.parseInt(input);
            numPieces -= piecesTaken;
           if (numPieces<=0){
               cakeIsLeft = false;
               System.out.printf("No more cake left!");

               if(numPieces<0){
                   numPieces = Math.abs(numPieces);
                   System.out.printf(" You need %d pieces more.",numPieces);
               }break;
           }
            input = scan.nextLine();
        }
        if (input.equals("STOP")){
            if(numPieces>0){
                System.out.printf(	"%d pieces are left.", numPieces );
            }
        }





    }
}
