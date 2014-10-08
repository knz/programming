import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

class Histogram
{
    PrintStream out;
    Scanner in;

    // Constructor:
    Histogram()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }

    // De methode "leesGetal" blijft een getal vragen aan de
    // gebruiker, zolang de gebruiker geen geldig getal invoert.
    int leesAantal()
    {
        out.println("Hoeveel getallen?");
        while(!in.hasNextInt())
        {
            out.println("Niet een getal, probeer nogmaal...");
            in.next();
        }
        return in.nextInt();
    }

    // "leesPositiefAantal" blijft vragen totdat een positief getal
    // wordt ingevoerd.
    int leesPositiefAantal()
    {
        int n;
        do {
            n = leesAantal();
        } while (!(n > 0));

        return n;
    }

    // lees een kommagetal in.
    double leesWaarde()
    {
        out.println("Geef een waarde:");
        while(!in.hasNextDouble())
        {
            out.println("Niet een getal, probeer nogmaal...");
            in.next();
        }
        return in.nextDouble();
    }

    double[] leesGetallen(int n)
    {
        double[] w = new double[n];

        int i;
        for (i = 0; i < n; i = i + 1)
        {
            w[i] = leesWaarde();
        }
        return w;
    }

    double[] getMinMax(double[] a, int n)
    {
        double[] minmax = new double[2];

        minmax[0] = a[0]; // minimum
        minmax[1] = a[0]; // maximum
        int i;
        for (i = 1; i < n; i = i + 1)
        {
            if (minmax[1] < a[i])
                minmax[1] = a[i];

            if (minmax[0] > a[i])
                minmax[0] = a[i];
        }

        return minmax;
    }


    final int AANTAL_CATEGORIEEN = 10;


    void tekenRegel(int n)
    {
        int i;
        for (i = 0; i < n; i = i + 1)
            out.printf("#");

        out.printf("\n");
    }

    void start()
    {
        int n = leesPositiefAantal();

        double[] a = leesGetallen(n);
        double[] minmax = getMinMax(a, n);


        //
        // De grenzen voor ieder categorie bepalen
        //
        double[] linkseGrens = new double[AANTAL_CATEGORIEEN];
        double[] rechtseGrens = new double[AANTAL_CATEGORIEEN];

        double b = (minmax[1]-minmax[0])/AANTAL_CATEGORIEEN;

        int i;
        for (i = 0; i < AANTAL_CATEGORIEEN; i = i + 1)
        {
            linkseGrens[i] = minmax[0] + b * i;
            rechtseGrens[i] = minmax[0] + b * (i + 1);
        }

        //
        // Tellen hoeveel waardes vallen in ieder categorie
        //

        int[] tellers = new int[AANTAL_CATEGORIEEN];
        for (i = 0; i < AANTAL_CATEGORIEEN; i = i + 1)
            tellers[i] = 0;

        for (i = 0; i < n; i = i + 1)
        {
            int j;
            for (j = 0; j < AANTAL_CATEGORIEEN; j = j + 1)
            {
                if (a[i] >= linkseGrens[j] &&
                    (a[i] < rechtseGrens[j] ||
                     (j == AANTAL_CATEGORIEEN-1 && a[i] == rechtseGrens[j]))   )
                {
                    tellers[j] = tellers[j] + 1;
                }
            }
        }

        //
        // Het resultaat printen
        //

        for (i = 0; i < AANTAL_CATEGORIEEN; i = i + 1)
        {
            out.printf("%6.2f tot %6.2f: ", linkseGrens[i], rechtseGrens[i]);
            tekenRegel(tellers[i]);
        }


    }


    public static void main(String[] args) {
        Histogram c = new Histogram();
        c.start();
    }
}
