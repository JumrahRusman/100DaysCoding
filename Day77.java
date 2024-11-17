import java.util.Scanner;
public class day77 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("makanan favorit :");
        String fav = input.nextLine();
        
        String n = fav.equals("gado gado") ? "iya" : "tidak";
        System.out.println("oh jadi kamu suka " +fav+ "?" +n);
         
    }
    
}
