//Program to check if two arrays are the same or not
// arrays are said to equal if both have same elements in any order

import java.util.*;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {10, 12, 1, 35, 6};
        int[] arr2 = {1, 35, 10, 12, 6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean res = Arrays.equals(arr1,arr2);

        if(res) System.out.println("Equal Arrays");
        else System.out.println("Not Equal");

        sc.close();
    }
    
}
