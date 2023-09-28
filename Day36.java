//Program to Count the Sum of Numbers in a String

import java.util.*;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int sum=0;

        for(char ch : str.toCharArray()){
            // int n= ch;
            if(Character.isDigit(ch)) sum+=Character.getNumericValue(ch);

            // System.out.println(sum);
        }

        System.out.println(sum);

        sc.close();
    }
}
