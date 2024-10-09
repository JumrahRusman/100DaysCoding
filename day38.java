package Day38;

import java.util.Scanner;

public class undaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan angka pertama : ");
        int angka1 = input.nextInt();
        
        System.out.print("masukkan angka kedua : ");
        int angka2 = input.nextInt();
        
//        perkalian
        angka1 *= angka2;
        System.out.println("hasil kali = " + angka1);
        
//        sisa bagi
        angka1 /= angka2;
        System.out.println("sasil sisa bagi = " + angka2);
              
      
    }
    
}
