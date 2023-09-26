//check given Number is Perfect Number
//if the sum of positive divisor(excluding no. itself) = to the given no.

import java.util.*;

public class Day17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp=0;

        for(int i=1; i<=n/2; i++){
            
            if(n%i==0) temp=temp+i;
            // System.out.print(temp+" ");
        }

        if(temp==n) System.out.println(n+" is PERFECT");
        else System.out.println(n+" is Not PERFECT");


        sc.close();
        
    }
    
}
