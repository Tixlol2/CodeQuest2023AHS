import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());

            for(int testcase = 0; testcase < testCases; testcase++) {

                String num_line = input.nextLine();

                String nums[] = num_line.split(" ");

                int num1 = Integer.parseInt(nums[0]);
                int num2 = Integer.parseInt(nums[1]);
                int num3 = Integer.parseInt(nums[2]);

                if (num1 + num2 == num3){

                    System.out.println("Addition");
                } else if (num1 - num2 == num3) {

                    System.out.println("Subtraction");

                } else if (num1 * num2 == num3) {

                    System.out.println("Multiplication");

                } else if (num1 / num2 == num3) {

                    System.out.println("Division");

                } else if (num1 % num2 == num3) {

                    System.out.println("Modulo");


                }


            }
        }
    }
}
