//Prime Number in a given Range
//no. that is only divisible by 1 or itself

import java.util.*;

public class Day21 {

    static boolean isPrime(int n){
        if(n==0 || n==1) System.out.println("Neither PRIME nor composite");
        for(int i=2; i<=n/2; i++){
            if((n%i==0) && (i!=n))
                return false;           
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lower = sc.nextInt();
        int upper = sc.nextInt();

        for(int i=lower; i<=upper; i++){

            if(isPrime(i)) System.out.print(i+" ");
            // else System.out.println("NOT PRIME");

        }

        


        sc.close();
    }
    
}
