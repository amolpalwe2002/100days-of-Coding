//Program to find the Array Type (EVEN, ODD or MIXED)
//array contains even no. or odd no. or both

import java.util.*;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        int even=0;
        int odd=0;
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            if(arr[i]%2==0) even++;
            else odd++;
        }

        if(even>0 && odd==0) System.out.println("EVEN");
        else if(odd>0 && even==0) System.out.println("ODD");
        else System.out.println("MIXED");


        sc.close();
    }
    
}
