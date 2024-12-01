
import java.util.Scanner;

public class day91 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int angka = input.nextInt();
            if (angka % 2 == 0) {
                System.out.println("angka genap");

            } else {
                System.out.println("you and i, end");
                break;
            }
        }
    }
}
