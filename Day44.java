package day44;
import java.util.Scanner;
public class undhaa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Logika And");
        
        System.out.print("nilai a = ");
        int a = input.nextInt();
        System.out.print("nilai b = ");
        int b = input.nextInt();
        
        System.out.print (a > b && b < a);
    }
}
