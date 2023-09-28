//Program to Remove Brackets from an Algebraic Expressions

import java.util.*;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1="";

        str1=str.replaceAll("[({})]", "");

        System.out.println(str1);

        sc.close();
    }
    
}
