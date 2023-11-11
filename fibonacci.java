

import java.lang.reflect.Array;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                int n = input.nextInt();

                int output = 0;

                ArrayList<Integer> sequence = new ArrayList<Integer>();

                sequence.add(0);
                sequence.add(1);
                sequence.add(1);


                for (int i = 2; i <= n ; i++) {

                    int first_num = sequence.get(i - 1);
                    System.out.println(sequence.get(i - 1));

                    int second_num = sequence.get(i);
                    System.out.println(sequence.get(i));

                    sequence.add(first_num + second_num);
                    System.out.println("heyy");

                }

                System.out.println(n + " = " + sequence.get(n-1));
                System.out.println(sequence);
            }

        }
    }
}
