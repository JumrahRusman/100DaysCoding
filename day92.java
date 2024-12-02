
public class day92 {

    public static void main(String[] args) {
        int tinggi = 5; // Tinggi pola

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < 2 * tinggi - 1; j++) {
                // Kondisi untuk mencetak bintang
                if (j == i || j == (2 * tinggi - 2 - i)) {
                    // Cek jika baris terakhir (i == tinggi - 1) dan mencegah duplikasi bintang
                    if (i == tinggi - 1 && j == i) {
                        System.out.print("*");
                        break; // Hentikan pencetakan di baris terakhir
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
