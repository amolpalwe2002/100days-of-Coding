//Find number of Even and Odd elements in an Array

import java.util.*;

public class Day45 {
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

        System.out.println("EVEN: "+ even+" ODD: "+odd);


        sc.close();
    }
    
}
