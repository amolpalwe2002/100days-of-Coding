//Find Smallest and Largest element in an Array

import java.util.*;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        // //Approach 01
        // Arrays.sort(arr);
        // System.out.println("MIN: "+arr[0]+" MAX: "+arr[size-1]);

        //Approach 02
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++ ){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("MIN: "+min+" MAX: "+max);
        sc.close();
    }
    
}
