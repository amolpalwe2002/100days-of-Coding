//Program to Replace substring in a String

import java.util.*;

public class Day41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next(); //original string
        String str2 = sc.next(); //substring to be replaced
        String str3 = sc.next(); //replacing string

        System.out.println(str1.replace(str2, str3));
        


        sc.close();
    }
    
}
