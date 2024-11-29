
import java.util.Arrays;
import java.util.Scanner;
public class day89{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("masukkan jumlah angka: ");
        int a = sc.nextInt();
        
        int jumrah[] = new int[a];
        
        int terbesar = 0;
        int terkecil = Integer.MAX_VALUE;
        for (int i = 0; i < jumrah.length; i++) {
            int angka = sc.nextInt();
            
            if (angka > terbesar) {
                terbesar = angka;
            }if (angka < terkecil) {
                terkecil = angka;
            }
            jumrah[i] = angka;
        }
        System.out.println(Arrays.toString(jumrah));
        System.out.println("angka terbesar: "+terbesar);
        System.out.println("angka terkecil: "+terkecil);
    }
 
}
