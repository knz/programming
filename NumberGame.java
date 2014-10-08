import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

class NumberGame
{
    PrintStream out;
    Scanner in;

    NumberGame()
    {
        out = new PrintStream(System.out);
        in = new Scanner(System.in);
    }

    final static int MAX_GETAL = 100;

    // De methode "leesGetal" blijft een getal vragen aan de
    // gebruiker, zolang de gebruiker geen geldig getal invoert.
    int leesGetal()
    {
        while(!in.hasNextInt())
        {
            out.println("Niet een getal, probeer nogmaal...");
            in.next();
        }
        return in.nextInt();
    }

    void start()
    {
        Random randomGenerator;
        int gekozenGetal;
        int score;
        int aantalPogingen;
        int gok;

        randomGenerator = new Random();
        gekozenGetal = randomGenerator.nextInt(MAX_GETAL);
        aantalPogingen = 0;
        do
        {
            aantalPogingen = aantalPogingen + 1;

            out.printf("Doe een gok? ");
            gok = leesGetal();

            if (gok > gekozenGetal)
                out.println("te groot!");

            if (gok < gekozenGetal)
                out.println("te klein!");

            if (gok == gekozenGetal)
                out.println("goed gegokt!");
        }
        while (aantalPogingen <= MAX_GETAL && gok != gekozenGetal);

        score = MAX_GETAL + 1 - aantalPogingen;
        out.printf("Score is %d\n", score);
    }


    public static void main(String[] args) {
        NumberGame c = new NumberGame();
        c.start();
    }
}
