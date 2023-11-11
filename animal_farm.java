import java.util.Scanner;
public class animal_farm {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                String first = input.nextLine();
                String first_list[] = first.split(" ");
                int turkey = Integer.parseInt(first_list[0]);
                int goats = Integer.parseInt(first_list[1]);
                int horses = Integer.parseInt(first_list[2]);

                int sum = (turkey*2) + (goats * 4) + (horses * 4);
                
                System.out.println(sum);

            }
        }
    }
}
