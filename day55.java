
package latihan;

import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai = " );
        int a = input.nextInt();
        for(int b = 0; b < a; a -=3){
            System.out.println("nilai = " + a);
            
        }
    }
    
}
