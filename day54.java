
package day54;

import java.util.Scanner;

public class unda {
    public static void main(String[] args) {
//membuat angka genap
    Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int akhir = input.nextInt();
        
        for(int mulai = 30; mulai >  akhir ; mulai +=2){
        System.out.println( mulai);

        }
    }
}
