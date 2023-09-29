//Capitalize the first and last letter of each word of a string

import java.util.*;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        //Approach 01
        String str1="";
        
        for(int i=0; i<str.length(); i++){
            if(i==0) str1+=Character.toUpperCase(str.charAt(i));                
            else if(i==str.length()-1) str1+=Character.toUpperCase(str.charAt(i));           
            else if(str.charAt(i+1)==' ') str1+=Character.toUpperCase(str.charAt(i));               
            else if(str.charAt(i-1)==' ') str1+=Character.toUpperCase(str.charAt(i));
            else str1+=str.charAt(i);
            
        }

        System.out.println(str1);

        sc.close();
    }
    
}
