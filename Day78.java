package day78;
import java.util.Scanner;
public class undhaaaa {
	public static void main(String[] args){
    
        Scanner input = new Scanner (System.in);
        
        System.out.print("makanan favorit :");
        String fav = input.nextLine();
        
        String n = fav.equalsIgnoreCase("bakso") ? "iya" : "tidak";
        System.out.println("oh jadi kamu suka " +fav+ "?" +n);
         
    }
	}

