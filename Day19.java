//Addition of Two Fraction

import java.util.*;

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1= sc.nextInt();
        int y1= sc.nextInt();
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        int x = x1*y2 + x2*y1;
        int y = y1 * y2;

        int temp=0;
        if(x>y) temp=y;
        else temp=x;        
        for(int i=temp/2; i>=2;i--){
            if(x%i==0 && y%i==0){
                x=x/i;
                y=y/i;
            }
        }
        

        System.out.println(x1+"/"+y1+" + "+x2+"/"+y2+" = "+x+"/"+y);



        sc.close();
    }
    
}
