//Check if two strings match where one string contains Wildcard characters(* & ?)

//ex: 
//str1= A*ol Pal?e --> string with wildcard characters
//str2= Amol Palwe --> string without wildcard characters
// ? --> matches with any single characters
// * --> matches any sequence of characters

import java.util.*;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean flag = true;
        int i=0, j=0;

        while(flag){
            if(str1.charAt(i)==str2.charAt(i)) flag = true;
            else if(str1.charAt(i)=='?'){
                if(str1.charAt(i+1)==str2.charAt(i+1)) flag = true;
                else flag = false;
            }
            else if(str1.charAt(i)=='*'){
                while(str1.charAt(i+1)!=str2.charAt(j)){
                    j++;
                }

            }
            else flag = false;

            i++;
            j++;
        }

        sc.close();
    }
    
}
