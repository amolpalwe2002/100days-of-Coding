//check whether given no. is +ve or -ve
import java.util.Scanner;
public class Day04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            int n = sc.nextInt();
            if(n>0) System.out.println(n+" is +ve no.");
            else if(n==0) System.out.println(n+ " is ZERO");
            else if(n<0) System.out.println(n+" is -ve no.");
        }catch(Exception e){
            System.out.println(e+"\nEnter valid Input...");

        }
        
        

        sc.close();
        
    }
    
}
