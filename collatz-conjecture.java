import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                int start_num = input.nextInt();

                int num = start_num;

                int length = 1;


                while (num != 1) {

                    if (num % 2 == 0) {

                        num = num / 2;

                        length = length + 1;

                    } else if (num % 2 == 1) {

                        num = (3 * num) + 1;

                        length = length + 1;

                    }
                }

                System.out.println(start_num + ":" + length);

            }
        }
    }
}
