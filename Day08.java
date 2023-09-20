//find the Number of Days in a given month of a given Year

import java.util.Scanner;

public class Day08 {
    static boolean checkLeapYear(int year){

        if(year%400==0 || (year%100!=0 && year%4==0)) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int y= sc.nextInt();
        if(n==2 && checkLeapYear(y)){
            System.out.println("29 Days");
        }else{
            switch (n) {
                case 1:
                    System.out.println("31 Days");
                    break;
                case 2:
                    System.out.println("28 Days");
                    break;
                case 3:
                    System.out.println("31 Days");
                    break;
                case 4:
                    System.out.println("30 Days");
                    break;
                case 5:
                    System.out.println("31 Days");
                    break;
                case 6:
                    System.out.println("30 Days");
                    break;
                case 7:
                    System.out.println("31 Days");
                    break;
                case 8:
                    System.out.println("31 Days");
                    break;
                case 9:
                    System.out.println("30 Days");
                    break;
                case 10:
                    System.out.println("31 Days");
                    break;
                case 11:
                    System.out.println("30 Days");
                    break;
                case 12:
                    System.out.println("31 Days");
                    break;
            
                default:
                    System.out.println("Enter valid Month");
                    break;
            }
        }

        sc.close();
    }
    
}
