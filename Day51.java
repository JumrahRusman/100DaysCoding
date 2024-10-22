import java.util.Scanner;
public class day51 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jam : ");
        int jam = input.nextInt();
        
        switch(jam){
            case 6:
            System.out.print("bangun pagi");
            break;
            case 8:
            System.out.print("sarapan");
            break;
            case 13:
            System.out.print("makan siang");
            break;
            case 19:
            System.out.print("makan malam");
            break;
            default:
            System.out.print("jangan lupa mamam");
        }
    }
}
