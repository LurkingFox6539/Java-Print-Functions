/*  Functions class for Java
 *   Mark Wheeler III
 *   January 20th, 2022
 *   Purpose:
 *       A small library of functions I wanted to have simplified so that they're more intuitive,
 *   along with some random ones just because. Use by using "import static functions.functions.*".
 */

package functions;
import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;

public class functions {
    static Scanner scanObj = new Scanner(System.in);

    // Prints the input directly, can be used without variables (i.e. print("Hello world");)
    static public void print(boolean input) { System.out.print(input); }
    static public void print(double input) { System.out.print(input); }
    static public void print(String input) { System.out.print(input); }
    static public void print(float input) { System.out.print(input); }
    static public void print(short input) { System.out.print(input); }
    static public void print(char input) { System.out.print(input); }
    static public void print(byte input) { System.out.print(input); }
    static public void print(long input) { System.out.print(input); }
    static public void print(int input) { System.out.print(input); }

    // Example usage is "int num = getInt();"
    // This will get an input from the user for your variable
    // Use by creating a variable and doing "yourVariable = getVariable()"
    static public char getChar() { return scanObj.next().charAt(0); }
    static public double getDouble() { return scanObj.nextDouble(); }
    static public boolean getBool() { return scanObj.nextBoolean(); }
    static public float getFloat() { return scanObj.nextFloat(); }
    static public short getShort() { return scanObj.nextShort(); }
    static public String getStr() { return scanObj.nextLine(); }
    static public long getLong() { return scanObj.nextLong(); }
    static public byte getByte() { return scanObj.nextByte(); }
    static public int getInt() { return scanObj.nextInt(); }

    // Integer production/calculation functions
    static public int getRand(int bound) {
        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt(bound);
    }

    // Returns a boolean output depending on user input
    static public boolean askYN() {
        char input = getChar();
        return Character.toLowerCase(input) == 'y';
    }

    // Sleep function
    static public void sleep(long input) throws InterruptedException { Thread.sleep(input); }

    // Heads true, tails false
    static public boolean coinFlip() { return getRand(2) == 0; }
}
