//Non-repeating characters in a String

import java.util.*;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[str.length()];
        char[] ch = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            freq[i]=1;

            for(int j=i+1; j<str.length(); j++){

                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }

            }
        }

        System.out.println("Non repeating characters in the string: ");
        for(int i=0; i<freq.length; i++){
            if(freq[i]==1 && ch[i]!=' ' && ch[i]!='0') System.out.print(ch[i]+" ");
        }

        sc.close();
    }
    
}
