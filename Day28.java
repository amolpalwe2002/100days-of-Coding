//Program to find the Double of the given Number without using Arithmetic Operator

import java.util.*;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n<<1); //bitwise left shift operator *2
        System.out.println(n>>1); //bitwise right shift operator /2

        sc.close();
    }
}
