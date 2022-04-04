import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input for textInput
        String textInput = in.nextLine();

        int result = editorMiss(textInput);
        System.out.print(result);
    }
    public static int  editorMiss(String textInput)
    {
        int  answer = 0;
        // Write your code here "@", "$", "^"
        String[] separatedWords = textInput.split(" ");
        for (int i = 0; i < separatedWords.length ; i++) {
            if (separatedWords[i].contains("@")||separatedWords[i].contains("$")||
                    separatedWords[i].contains("^")){
                answer++;

            }
        }

        return answer;
    }
}
