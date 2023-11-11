import java.util.Scanner;
public class theBottomLine {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                String first = input.nextLine();

                int cc = Integer.parseInt(first.split(" ")[0]);

                int lbl = Integer.parseInt(first.split(" ")[1]);

                if (cc == lbl){

                    System.out.println("Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft");


                } else if (cc > lbl) {

                    System.out.println("Cassowary Craft sold " + (cc - lbl) + " more aircraft");


                } else if (lbl > cc) {

                    System.out.println("Lead Balloons Ltd sold " + (lbl - cc) + " more aircraft");


                }


            }
        }
    }
}
