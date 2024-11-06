package Ang_Ang;

import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukaan angka = ");
        int a = input.nextInt();
       
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("o ");
              }
            System.out.println("");
            
        }
        
        System.out.println("======================");
        System.out.print("panjang = ");
        int c = input.nextInt();
        System.out.print("lebar = ");
        int d = input.nextInt();
        
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(" *");
                
            }
            System.out.println(" ");
            
        }
    }
    
}
