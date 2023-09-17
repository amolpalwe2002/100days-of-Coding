// check whether the given no. is even or odd

import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n= sc.nextInt();
        if((n%2)==0) System.out.println(n+" is even no.");
        else System.out.println(n+" is odd no.");
        } catch (Exception e) {
            System.out.println(e+"\nEnter valid Input...");
        }
        sc.close();
    }
    
}
