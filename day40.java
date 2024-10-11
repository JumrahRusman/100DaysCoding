
package day40;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("umur = ");
        int x = input.nextInt();
        
        
//        percabangan 
        
        if (x < 12){
            System.out.print("anak anak");
        } else if (x > 12 && x < 18){
              System.out.print("anak remaja");  
        } else if (x > 18 && x < 60){
             System.out.println("dewasa");
        }  
        else{
            System.out.println("nenek2 jompo");
        }
            
    }
    
}
