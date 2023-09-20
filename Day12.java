//print Fibonacci Series

import java.util.*;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int n1=0,n2=1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        while(n>0){
            int temp= n1+n2;
            n1=n2;
            n2=temp;
            n--;
            System.out.print(temp+" ");
        }
        sc.close();
    }
    
}
