
import java.util.Scanner;


public class day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bilangan pertama : ");
        int a = input.nextInt();
        System.out.print("bilangan  kedua : ");
        int b = input.nextInt();
        System.out.print("bilangan ketiga : ");
        int  c = input.nextInt();
        
        int hasilKali = a * b * c;
        System.out.println("hasil perkalian = " + hasilKali);
        int hasilBagi = a / c ;
        System.out.println("hasil bagi = " + hasilBagi);
        int hasilSisaBagi = a % b;
        System.out.println("hasilSisaBagi = " + hasilSisaBagi);
    }
    
}
