
package day49;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai a : ");
        int a = input.nextInt();
        System.out.print("masukkan nilai b : ");
        int b = input.nextInt();
        
        if(a==b){
            System.out.println("nilai sama");
        }else if(a!=b){
            System.out.println("nilai tidk sama");
        }
    }
    
}
