import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        System.out.println("membuat Scanner");
        Scanner input = new Scanner (System.in);
        
        System.out.print("nama :");
        String a = input.nextLine();
        
        System.out.print("umur :");
        byte b = input.nextByte();
        
        System.out.print("berat badan :");
        int c = input.nextInt();
        
        System.out.print("tinggi badan :");
        float d = input.nextFloat();
        
    }
}
