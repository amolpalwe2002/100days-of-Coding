//Reverse a given Number

import java.util.*;

public class Day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = "";
        int rev=0;
        while(n>0){
            str=str+(n%10); //appraoch 1
            rev=rev*10 + (n%10); //approach 2
            n=n/10;
        }

        System.out.println(str);
        System.out.println(rev);

        sc.close();
    }
    
}
