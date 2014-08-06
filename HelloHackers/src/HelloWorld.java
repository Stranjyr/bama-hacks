import java.util.Scanner;

/**
 * Created by William on 8/6/2014.
 */
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.printf("Dude, what's your name?\n&>>");
        Scanner in = new Scanner(System.in);
        System.out.printf("Welcome to Git, %s", in.next());
    }


}
