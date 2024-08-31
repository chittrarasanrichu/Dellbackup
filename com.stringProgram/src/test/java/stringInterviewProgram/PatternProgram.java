package stringInterviewProgram;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args)
    {
        {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the triangle number : ");
            int n=+Sc.nextInt();
            for(int i =0;i<n;i++) {
                for(int j=0;j<=i;j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }

        }
    }
}
