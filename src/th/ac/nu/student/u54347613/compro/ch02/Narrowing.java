
package th.ac.student.u54347613.compro.ch02;

public class Narrowing {
    public static void main(String[] args) {
        int i = 32768;
        short s = (short) i;
        System.out.println("i = " + i + ", s = " + s); // i = 32768, s = -32768
    
    }
}
