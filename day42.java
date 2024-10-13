package day42;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai m = ");
        int m = input.nextInt();
        System.out.print("nilai n = ");
        int n = input.nextInt();
        
        if (m == n){
            System.out.println("dua nilai yang sama");
              
        }else if ( m != n){
        System.out.println("dua nilai tidak sama");
    }
        
    }
    
}
