//find Roots of a Quadratic Equation

import java.util.Scanner;
import java.util.*;

public class Day09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;

        a=sc.nextDouble(); b=sc.nextDouble(); c=sc.nextDouble();
        double D = Math.pow(b,2) - (4*a*c);
        Double root = Math.sqrt(Math.abs(D));

        if(a==0) System.out.println("Invalid input");
        else if(D==0){
            System.out.println("Roots: "+(-b/2*a)+" "+(-b/2*a));
        }
        else if(D>0){
            System.out.println("Roots: "+((-b+root/2*a) +" "+((-b-root)/2*a)));
        }else{
            System.out.println("Roots: "+(-b/2*a +"-"+root/2*a+"i") +" "+(-b/2*a +"+"+root/2*a+"i"));
        }
        sc.close();
        
    }
    
}
