
/**
 * Write a description of class postincrement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class postincrement
{
    public static void main(String[] args) {
        int n = 7;
        int x = n-- - --n + n++ + ++n;

        System.out.println("n = " + n);
        System.out.println("x = " + x);
    }
}