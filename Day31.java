//Program to print Length of the string without using strlen() function

import java.util.*;

public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int i=0;
        for(char c : ch){
            i++;
        }
        System.out.println(i);
        // System.out.println(ch.length);

        sc.close();
    }
    
}
