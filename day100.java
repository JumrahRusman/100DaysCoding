
import java.util.Scanner;

public class day100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah baris : ");
        int n = input.nextInt();

        System.out.print("jumlah kolam : ");
        int m = input.nextInt();

        int jumlah = 0;
        int terbesar = Integer.MIN_VALUE;
        int jumlahElemen = n*m;
        for (int i = 1; i <= n; i++) {
            System.out.print("input elemen baris ke " + i + ":");
            for (int j = 1; j <= m; j++) {
                int angka = input.nextInt();
                jumlah += angka;
               
                if (angka > terbesar) {
                    terbesar = angka;

                }

            }

        }
        System.out.println("-------------------------------------");
        System.out.println("jumlah elemen dalam array : " + jumlahElemen);
        System.out.println("elemen terbesar : " + terbesar);
        System.out.println("total penjumlahan semua elemen : " + jumlah);

    }

}
