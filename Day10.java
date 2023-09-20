//find the number of Digits in a given Integer

import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = "";
        int count=0, temp=n;

        while(temp!=0){
            str=str+temp%10;
            temp=temp/10;
            count++;
        }

        System.out.println(count+"  -->  "+str);

        sc.close();
    }
    
}
