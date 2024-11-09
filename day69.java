
package sugandi;
public class soal3 {
    public static void main(String[] args) {
        int a = 0;
       
        while (a<5){
            int b = 0;
            while(b<5){
            
                if (a==0 || a==5-1 || b==0|| b==5-1) {
                   System.out.print("o"); 
                }else{
                    System.out.print(" ");
                }
                  b++;
           
            }
           System.out.println();
        a++;
    } 
        
    } 
}
