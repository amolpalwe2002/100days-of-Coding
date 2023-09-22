//find the Sum of first N natural numbers

import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        //using direct formula
        System.out.println(n*(n+1)/2);
        int sum=0;

        //using while loop
        // while(n>0){
        //     sum=sum+n;
        //     n--;

        // }
        System.out.println(sum);

        sc.close();
    }
    
}
