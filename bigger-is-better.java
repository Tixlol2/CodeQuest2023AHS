import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                String first = input.nextLine();

                int max = 0;

                String first_num[] = first.split(" ");

                for (String num : first_num){

                    int number = Integer.parseInt(num);

                    if (number > max){

                        max = number;


                    }


                }

                System.out.println(max);


            }
        }
    }
}
