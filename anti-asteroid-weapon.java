//UNSOLVED

import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                List<String> asteroids_list = new ArrayList<>();
                
                List<Double> asteroid_dist = new ArrayList<>();

                int asteroids = input.nextInt();

                String first = input.nextLine();

                int i = 0;

                while ( i < asteroids){

                    asteroids_list.add(input.nextLine());

                    i++;
                }

                for (String asteroid : asteroids_list){

                    


                }


            }
        }
    }
}
