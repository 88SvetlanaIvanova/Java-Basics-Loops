import java.util.Scanner;

public class a09_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int volume = width*length*height;//200
        //int total =0;
        boolean hasVolume = true;



        String command = scanner.nextLine();
               while (!command.equals("Done")){
            //
            int box = Integer.parseInt(command);

            volume -= box;
                if(volume< 0){
                hasVolume = false;
                break;
            }
                command = scanner.nextLine();



        }

        if (hasVolume){
            //int diff = area - space;
            System.out.printf("%d Cubic meters left.", volume);
        }else System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));

    }
}
