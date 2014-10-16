import java.io.PrintStream;
import java.util.Scanner;

class Alphabet2
{

    PrintStream out;
    Scanner in;

    Alphabet2()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }

    public final int LENGTE_ALPHABET = 26;
    public final int CODE_A = 'a';
    public final int CODE_Z = 'z';

    void start()
    {

        // het volgende is gelijk aan Alphabet,
        // maar dan met 'for'-loopjes in plaats van 'while'

        int n;

        for (n = 0; n < LENGTE_ALPHABET; n = n + 1)
        {
            out.printf("%c", CODE_A + n);
        }
        out.printf("\n");

        // ook:
        for (n = CODE_A; n <= CODE_Z; n = n + 1)
        {
            out.printf("%c", n);
        }
        out.printf("\n");

    }

    public static void main(String[] args)
    {
        Alphabet2 c = new Alphabet2();
        c.start();
    }
}
