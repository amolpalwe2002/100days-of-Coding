//Sort the given array

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        for(int n: arr){
            System.out.print(n+" ");
        }

        sc.close();
    }
    
    
}
