//UNSOLVED

import java.util.Scanner;
public class batterUp {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {

                String first = input.nextLine();

                String name = first.split(":")[0];

                String bases = first.split(":")[1];

                String bases_list[] = bases.split(",");

                int total_ab = 0;

                int single = 0;

                int doub = 0;

                int triple = 0;

                int hr = 0;

                int total = 0;

                for (String base : bases_list) {

                    switch (base) {

                        case ("K"):
                            total_ab = total_ab + 1;
                            break;
                        case ("1B"):
                            total = total + 1;
                            total_ab = total_ab + 1;
                            System.out.println("single");
                            break;
                        case ("2B"):
                            System.out.println("double");
                            total = total + 2;
                            total_ab = total_ab + 1;
                            break;
                        case ("3B"):
                            System.out.println("Triple");
                            total = total + 3;
                            total_ab = total_ab + 1;
                            break;
                        case ("HR"):
                            System.out.println("HR");
                            total = total + 4;
                            total_ab = total_ab + 1;
                            break;


                    }

                }

                System.out.println(total);
                System.out.println(total_ab);

                double quotient = total / total_ab;

                System.out.println(name + "=" + String.format("%.3f %n", quotient));

                float quo = 3/4;

                System.out.println(quo);

            }
        }
    }
}
