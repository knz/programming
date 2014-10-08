class Max
{
    void start()
    {
        double a[] = {1.55556, 3.2123, 3.11, 1, 0, 2};

        double m = 0;
        int i = 0;

        while (i < a.length)
        {
            if (m < a[i])
            {
                m = a[i];
            }
            i = i + 1;
        }
        System.out.println("Maximum is " + m);
    }

    public static void main(String[] args) {
        Max m = new Max();
        m.start();
    }
}
