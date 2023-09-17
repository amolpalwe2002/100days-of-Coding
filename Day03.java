//Identify whether the character is alphabet or not
import java.util.Scanner;
public class Day03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().toLowerCase().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println(ch + " is an Alphabet");
        }else System.out.println(ch + " is not an Alphabet");
        sc.close();

        //Character.isAlphabetic() return true is given charater is an alphabet
        //System.out.println(Character.isAlphabetic(ch));

        
    }
    
}
