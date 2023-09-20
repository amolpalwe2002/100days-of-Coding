//find Factorial of a Number

import java.util.*;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int fact=1;
        if(n==0 || n==1) System.out.println(n+"! = 1");
        else{
            while(temp>0){
                fact=fact*temp;
                temp--;
        }
        System.out.println(n+"! = "+fact);
        }
        
        sc.close();
    }
    
}
