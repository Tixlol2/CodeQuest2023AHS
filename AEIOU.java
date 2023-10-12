import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                String sentence = input.nextLine();

                String letter_list[] = sentence.split("");

                int total = 0;

                for (String letter : letter_list) {

                    if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {

                        total = (total + 1);


                    }


                }

                System.out.println(total);


            }
        }
    }
}
