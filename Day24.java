//Program to Replace all 0's with 1's of a given Integer

import java.util.*;

public class Day24 {

    static int revNum(int n){
        int temp=n;
        int n1=0;

        while(temp>0){
            n1 = n1*10 +(temp%10);
            temp=temp/10;

        }

        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //Approach 02

        String str = Integer.toString(n);
        String str1= "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== '0' )  str1 = str1 + '1';
            else str1 = str1 + str.charAt(i);
            System.out.println(str1);
        }

        System.out.println(str1);


        // Approach 01

        // int temp=n;
        // int n1=0;

        // while(temp>0){
        //     if(temp%10==0) n1=n1*10 + 1;
        //     else n1=n1*10 + (temp%10);
        //     temp = temp/10;
        // }
        // // System.out.println(n1);

        // n1 = revNum(n1);

        // // System.out.println(n);
        // System.out.println(n1);

        sc.close();
    }
    
}
