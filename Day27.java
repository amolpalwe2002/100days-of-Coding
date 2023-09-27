//Program to calculate Maximum number of Handshakes

import java.util.*;

public class Day27 {

    static void noOfHandshakes(int n){
        int temp=n-1;
        int h=0;
        while((temp)>0){
            h=h+temp;
            temp--;
        }
        System.out.println(h);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        noOfHandshakes(n);

        

        sc.close();
    }
}
