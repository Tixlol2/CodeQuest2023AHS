import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                String first = input.nextLine();

                int max_speed = 81;

                int min_speed = 60;


                int my_speed = Integer.parseInt(first.split(" ")[0]);

                boolean birthday = Boolean.parseBoolean(first.split(" ")[1]);

                if (birthday){

                    max_speed = max_speed + 5;
                    min_speed = min_speed + 5;

                }

                if (my_speed <= min_speed){

                    System.out.println("no ticket");


                } else if (min_speed < my_speed && my_speed < max_speed) {

                    System.out.println("small ticket");


                } else if (my_speed >= max_speed) {

                    System.out.println("big ticket");


                }


            }
        }
    }
}
