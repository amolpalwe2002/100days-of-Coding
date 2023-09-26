// Given Number is Armstrong or Not
//ex: 123 = (1^3) + (2^3) + (3^3)

import java.util.*;

public class Day20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int len=0, temp=n;
        while(temp>0){
            len++;
            temp=temp/10;
        }
        // System.out.println(len);

        double arm=0;
        temp=n;        
        while(temp>0){
            double div =temp%10;
            arm = arm + Math.pow(div, len);
            temp=temp/10;       
        }

        // System.out.println(arm);

        if(arm == n) System.out.println("ARMSTRONG");
        else System.out.println("NOT ARMSTRONG");

        sc.close();
        
    }

}