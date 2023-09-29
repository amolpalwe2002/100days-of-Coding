//Remove Duplicate Elements in an Array

import java.lang.reflect.Array;
import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) arr[j]=-404;
            }            
        }

        for(int n: arr){
            System.out.print(n+" ");
        }

        sc.close();
    }
    
    
}
