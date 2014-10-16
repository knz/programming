import java.io.PrintStream;
import java.util.Scanner;

class AlphabetZonderK
{

    PrintStream out;
    Scanner in;

    AlphabetZonderK()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }


    public final int LENGTE_ALPHABET = 26;
    public final int CODE_A = 'a';
    public final int CODE_Z = 'z';
    public final int CODE_K = 'k';

    void start() {

        // het volgende programma print een alphabet
        // zonder de letter k

        int n;
        for (n = CODE_A; n < CODE_K; n = n + 1)
        {
            out.printf("%c", n);
        }
        for (n = CODE_K + 1; n <= CODE_Z; n = n + 1)
        {
            out.printf("%c", n);
        }
        out.printf("\n");

        // andere manier:
        for (n = CODE_A; n <= CODE_Z; n = n + 1)
        {
            if (n == CODE_K)
            {
                n = n + 1;
            }
            out.printf("%c", n);
        }
        out.printf("\n");

        // andere  (ook de beste omdat het korter is)
        for (n = CODE_A; n <= CODE_Z; n = n + 1)
        {
            if (n != CODE_K)
            {
                out.printf("%c", n);
            }
        }
        out.printf("\n");

        // en nog een:
        for (n = CODE_A; n <= CODE_Z; n = n + 1)
        {
            if (n == CODE_K)
            {}
            else
            {
                out.printf("%c", n);
            }
        }
        out.printf("\n");

    }


    public static void main(String[] args) {
        AlphabetZonderK c = new AlphabetZonderK();
        c.start();
    }
}
