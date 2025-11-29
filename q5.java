
/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
    public static void main (String[] args){
        int x = 2;
        int y = 3;
        int z = ++x - y++ + x-- + --y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
    }
}