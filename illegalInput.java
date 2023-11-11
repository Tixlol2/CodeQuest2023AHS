// UNFINISHED

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class illegalInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                int loop = input.nextInt();

                long sum = 0L;

                for (int i = 0; i < loop; i++){

                    String numString = input.nextLine();

                    long num = Long.parseLong(numString);

                    sum += num;


                }

                System.out.println(sum);


            }
        }
    }
}
