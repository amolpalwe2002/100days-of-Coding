//Calculate the Frequency of Characters in a Given String

import java.util.*;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int[] freq = new int[str.length()];

        for(int i=0; i<ch.length; i++){
            freq[i]=1;
            for(int j=i; j<ch.length;j++){

                if(ch[i]==ch[j]) freq[i]++;
                ch[j]='0';

            }
            // System.out.println(ch[i]+" ==> "+freq[i]);
        }

        sc.close();
    }
    
}
