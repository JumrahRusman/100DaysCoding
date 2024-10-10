package day39;
import java.util.Scanner;
public class lthn {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        
        System.out.print("masukkan nilai a = ");
        int a = input.nextInt();
        
        a %= 5;
        System.out.println("nilai sisa bagi = " + a );
       
        
    }
    
}
