//factors of a given no.

import java.util.*;

public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        System.out.println("Factors of "+n);

        for(int i=1; i<=n/2; i++){
            if(n%i==0) System.out.print(i+" ");
        }
        System.out.print(n);

        sc.close();
    }
    
}
