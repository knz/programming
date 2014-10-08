import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

class Gemiddelde
{
    PrintStream out;
    Scanner in;

    Gemiddelde()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }

    // De methode "leesGetal" blijft een getal vragen aan de
    // gebruiker, zolang de gebruiker geen geldig getal invoert.
    int leesAantal()
    {
        out.println("Hoeveel cijfers?");
        while(!in.hasNextInt())
        {
            out.println("Niet een getal, probeer nogmaal...");
            in.next();
        }
        return in.nextInt();
    }

    int leesPositiefAantal()
    {
        int n;
        do
        {
            n = leesAntal();
        }
        while (!(n > 0));

        return n;
    }

    // lees een kommagetal in.
    double leesCijfer()
    {
        out.println("Geef een cijfer:");
        while (!in.hasNextDouble())
        {
            out.println("Niet een cijfer, probeer nogmaal...");
            in.next();
        }
        return in.nextDouble();
    }

    void start()
    {
        double som, a;
        int i, n;

        n = leesPositiefAantal();
        som = 0;
        for (i = 1; i <= n; i = i + 1)
        {
            a = leesCijfer();
            som = som + a;
        }

        out.printf("G = %.2f\n", som / n);
    }



    public static void main(String[] args) {
        Gemiddelde c = new Gemiddelde();
        c.start();
    }
}
