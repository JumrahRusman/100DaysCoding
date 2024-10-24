
import java.util.Scanner;


public class day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int akhir = input.nextInt();
        
        for(int mulai = 27; mulai < akhir ; mulai+=3){
        System.out.println("penjumlahan " + mulai);
    }
    }
}
