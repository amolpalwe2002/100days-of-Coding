//Program to express a Number as a Sum of Two Prime numbers

import java.util.*;

public class Day23 {

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

        int n=sc.nextInt();

        for(int i=2; i<n; i++){

            if(isPrime(i) && isPrime(n-i)){
                System.out.println(i+" "+(n-i));
                // break;
            }
            // else System.out.println("No numbers found");

        }

        sc.close();
    }
    
}
