//Program to check if String is a Palindrome or not

import java.util.*;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1="";

        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }

        if(str.equalsIgnoreCase(str1)) System.out.println("PALINDROME");
        else System.out.println("NOT PALINDROME");

        sc.close();
    }
    
}
