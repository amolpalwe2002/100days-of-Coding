//I dentify whether the character is vowel or consonant

import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        
        if(ch>='a' && ch<='z'){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println(ch+" is vowel.");
            }else System.out.println(ch +" is a consonant.");
        }else System.out.println("Enter valid input!");
        
        
    }
    
}
