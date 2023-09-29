//Program to find largest Palindrome in an Array

import java.util.Scanner;

public class Day48 {

    static boolean isPalin(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            rev= rev*10 + (temp%10);
            temp/=10;
        }

        if(n==rev) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        int maxpalin= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            if(isPalin(arr[i])){
                if(arr[i]>maxpalin) maxpalin = arr[i];
            }
        }

        System.out.println(maxpalin);



        sc.close();
    }
    
    
}
