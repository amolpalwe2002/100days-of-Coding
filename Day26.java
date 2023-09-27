//Pyramid Pattern

import java.util.*;

public class Day26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=i; j<=row; j++){
                System.out.print("  ");
                // System.out.print("-  ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}