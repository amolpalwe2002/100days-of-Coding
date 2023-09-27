//Given Number is Palindrome
//a no. which same to the given no. in reverse order

import java.util.*;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp=n;
        int n1=0;

        while(temp>0){
            n1 = n1*10 +(temp%10);
            temp=temp/10;

        }

        if(n==n1) System.out.println("PALINDROME");
        else System.out.println("NOT PALINDROME");

        sc.close();
    }
}
