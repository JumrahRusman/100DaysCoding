import java.util.Scanner;
public class day88 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] nilai = new int[5];
        int total = 0;
       
        for (int i = 0; i < 5; i++) {
            nilai[i] = input.nextInt();
            total += nilai[i];
            
        }
        double rataRata = (double) total / nilai.length;
         
        System.out.println("total nilai : " + total);
        System.out.println("rata-rata nilai : " + rataRata);
           
        } 
}
