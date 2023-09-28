//Program to Toggle each Character in a String 
//Lowercase to Uppercase & viceversa 

import java.util.*;

public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        String str1="";

        for(char ch : str.toCharArray()){

            if(Character.isUpperCase(ch)){
                str1+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                str1+=Character.toUpperCase(ch);
            }
        }

        System.out.println(str1);

        sc.close();
    }
    
}
