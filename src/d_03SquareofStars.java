import java.util.Scanner;

public class d_03SquareofStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStars = Integer.parseInt(scanner.nextLine());
        for (int outer = 1; outer <= numberOfStars ; outer++) {
            System.out.print("*");
            for (int inner = 1; inner <=numberOfStars-1 ; inner++) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
