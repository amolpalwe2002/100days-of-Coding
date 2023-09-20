//find the Quadrants in which co-ordinates lie

import java.util.Scanner;

public class Day07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        int y= sc.nextInt();

        if(x>0){
            if(y>0) System.out.println("I quad");
            else System.out.println("IV quad");
        }
        else if(x==0 && y==0) System.out.println("Origin");
        else{
            if(y>0) System.out.println("II quad");
            else System.out.println("III quad");
        }

        sc.close();
    }
    
}
