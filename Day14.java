//find the Sum of Digits of a given Number

import java.util.*;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);

        sc.close();
    }
    
}
