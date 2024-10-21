
package day50;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai N = ");
        int N = input.nextInt();
        System.out.print("nilai M = ");
        int M = input.nextInt();
        
        if(N == M){
            System.out.println("sama");
        }else if(N > M){
            System.out.println("besar");
        }else
            System.out.println("kecil");
    }
    
}
