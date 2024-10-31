
package day60;

import java.util.Scanner;

public class undaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int awal, akhir;
      
        System.out.print("awal : ");
        awal = input.nextInt();
      
        System.out.print("akhir : ");
        akhir = input.nextInt();
        
        int a = awal;
        do{
            System.out.print(a+" ");
            a++;
        }while(a<=akhir);
        System.out.print(" ");
        
    }
}


    

