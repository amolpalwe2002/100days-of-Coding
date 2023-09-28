//Program to Remove vowels from a String

import java.util.*;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        

        String str1="";

        // //Approach 01
        // str= str.toLowerCase();
        // for(char ch : str.toCharArray()){
        //     if(Character.isAlphabetic(ch)&& (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
        //         // str1+="-";
                
        //     }else str1+=ch;
        // }
        

        //Approach 02
        str1 = str.replaceAll("[aeiouAEIOU]",
        "");


        System.out.println(str1);

        sc.close();
    }
    
}
