public class Main {
    
    public static void main(String[] args) {
        System.out.println("hallo, selamat malam");
        byte myByte = 9;
        int myInt = myByte;  // Otomatis casting: byte ke int
        System.out.println(myInt);  // Output: 9
        
            long myLong= 27;
            double myDouble= (int) myLong;  // Manual casting: long ke diuble
             System.out.println(myDouble);  // Output: 27.0
        
    }
    
}
