//check whether a given Number is STRONG or NOT
//A no. is said to be STRONG is sum of factorial of the digits = no.
//ex: 1! + 4! + 5! = 1+24+120 = 145

import java.util.*;

public class Day16 {

    static int fact(int n){
        int f=1;
        if(n==1 || n==0) return 1;
        else{
            while(n>0){
                f=f*n;
                n--;
            }
            return f;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0, temp=n;
        

        while(temp>0){
            int rem=temp%10;
            
            sum=sum+(fact(rem));
            temp=temp/10;
        }
        
        if(sum==n) System.out.println("STRONG");
        else System.out.println("Not STRONG");



        sc.close();
        
    }
    
}
