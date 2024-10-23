
package day52;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x = input.nextInt();
        String hasil = (x % 2 == 0)? "genap": "ganjil";
        System.out.println(hasil);
    }
    
}
