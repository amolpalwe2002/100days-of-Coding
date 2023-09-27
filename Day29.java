//Program to Reverse a String

import java.util.*;

public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String revStr="";

        for(int i=str.length()-1; i>=0; i--){
            revStr+=str.charAt(i);

        }

        System.out.println(revStr);

        sc.close();
    }
    
}
