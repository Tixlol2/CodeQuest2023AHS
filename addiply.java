import java.util.Scanner;
public class addiply {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
        
        for(int testcase = 0; testcase < testCases; testcase++) {
            
            String first = input.nextLine();
            String second[] = first.split(" ");
            int num1 = Integer.parseInt(second[0]);
            int num2 = Integer.parseInt(second[1]);
            
            int sum = num1 + num2;
            int product = num1 * num2;
            
            
            
            System.out.println(Integer.toString(sum) + " " + Integer.toString(product));
            
            
            
                }
            }
        }
    }
