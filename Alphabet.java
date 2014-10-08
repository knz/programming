import java.io.PrintStream;
import java.util.Scanner;

class Alphabet
{

    PrintStream out;
    Scanner in;

    Alphabet()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }

    public final int LENGTE_ALPHABET = 26;
    public final int CODE_A = 97;
    public final int CODE_Z = 122;

    void start()
    {

        // het volgende programma schrijft een alphabet uit op 1
        // regel.

        int n;

        // Pas op, hier was "for" beter geschikt dan "while".
        n = 0;
        while (n < LENGTE_ALPHABET)
        {
            out.printf("%c", CODE_A + n);
            n = n + 1;
        }
        out.printf("\n");

        // het volgende programma doet hetzelfde op
        // een andere manier.
        // Weer was hier "for" beter geschikt dan "while".
        n = CODE_A;
        while (n <= CODE_Z)
        {
            out.printf("%c", n);
            n = n + 1;
        }
        out.printf("\n");
    }

    public static void main(String[] args) {
        Alphabet c = new Alphabet();
        c.start();
    }
}
