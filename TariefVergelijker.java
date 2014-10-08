import java.io.PrintStream;
import java.util.Scanner;

class TariefVergelijker
{

    PrintStream out;
    Scanner in;

    TariefVergelijker()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }

    // De volgende 3 waarden veranderen nooit, daarom noemen we ze
    // "constanten" en schrijven we hun naam in hoofdletters.
    public final double DAG_TARIEF = 25;
    public final double UUR_TARIEF = 40;
    public final double OVERWERK_TARIEF = 60;

    void start() {

        // Het volgende programma bepaalt of het gunstiger is
        //    om werk te doen op 2 dagen in plaats van 1.

        double n; // n is het aantal uren.
        double prijs, prijsMetOverwerk, prijsMetTweeDagen;
        int aantalDagen;

        n = in.nextDouble();

        aantalDagen = 1;

        if (n <= 8)
        {
            prijs = DAG_TARIEF + n * UUR_TARIEF;
        }
        else
        {
            prijsMetOverwerk = DAG_TARIEF + (n-8) * OVERWERK_TARIEF + 8 * UUR_TARIEF;
            prijsMetTweeDagen = 2 * DAG_TARIEF + n * UUR_TARIEF;

            if (prijsMetOverwerk < prijsMetTweeDagen)
            {
                prijs = prijsMetOverwerk;
            }
            else
            {
                prijs = prijsMetTweeDagen;
                aantalDagen = 2;
            }
        }
        out.println("Beste is " + aantalDagen + " dagen, prijs = " + prijs);
    }


    public static void main(String[] args) {
        TariefVergelijker c = new TariefVergelijker();
        c.start();
    }
}
