class Conversie
{
    void start()
    {
        int x;
        short y;
        byte z;
        char c;
        float f;

        x = 131137;
        System.out.println("x = " + x);

        y = (short)x;
        System.out.println("y = " + y);

        z = (byte)x;
        System.out.println("z = " + z);

        f = (float)x;
        System.out.println("f = " + f);

        c = (char)x;
        System.out.println("c = " + c);

        x = -131137;
        y = (short)x;
        z = (byte)x;
        c = (char)x;
        f = (float)x;
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("f = " + f);
        System.out.println("c = " + c);

        x = 945;
        System.out.println("x = " + x);
        c = (char)x;
        System.out.println("c = " + c);


    }


    public static void main(String[] args)
    {
        Conversie c = new Conversie();
        c.start();
    }
}
