//find the ASCII value of the character

import java.util.Scanner;
public class Day06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int ascii = ch;

        System.out.println("ASCII value of "+ch+" is "+ascii);
        System.out.println("ASCII value of "+ch +" is "+(int)ch);

        sc.close();

    }
    
}
