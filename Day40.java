//Program to Check if two Strings are Anagram or Not
//two strings are said to be anagram if one string can be formed by rearranging the characters of other string

import java.util.*;

public class Day40 {
    static int[] countCharacters(String str){

        int[] freq = new int[str.length()];

        char[] ch = str.toCharArray();
        
        for(int i=0; i<str.length(); i++){
            freq[i]=1;
            for(int j=i+1; j<str.length(); j++){
                if(ch[i] == ch[j]){
                    freq[i]++;
                    ch[j] = '0';
                }

            }
        }

        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        
        

        if(str1.length()==str2.length()){

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean res = Arrays.equals(ch1, ch2);

            if(res) System.out.println("ANAGRAM");
            else System.out.println("NOT ANAGRAM");

                
            
            

            
        }
        else System.out.println("NOT ANAGRAM");


        sc.close();
    }
    
}
