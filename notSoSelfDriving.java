import java.util.Scanner;
public class notSoSelfDriving {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
        
        for(int testcase = 0; testcase < testCases; testcase++) {
            String input1 = input.nextLine();
            String input2[] = input1.split(":");
            double speed = Double.parseDouble(input2[0]);
            double dist = Double.parseDouble(input2[1]);
            
            if (speed >= dist){
              
              System.out.println("SWERVE");
              
              
            }
            
            else if ((speed * 5) >= dist){
              
              System.out.println("BRAKE");
              
              
            }
            
            else{
              
              System.out.println("SAFE");
              
              
            }
            
            
            
                }
            }
        }
    }
