public class Fibonaccci
{

    public static void Main(string[] args)
    {
        Fibonaccci fib = new Fibonaccci(6, 2, 5);
        fib.PrintSeries();
    }
    private int n;
    private int a1;
    private int a2;

    public Fibonaccci()
    {
        this.n = 6;
        this.a1 = 1;
        this.a2 = 1;
    }

    public Fibonaccci(int n, int a1, int a2)
    {
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
    }

    public void SetN(int n)
    {
        this.n = n;
    }

    public void SetA1(int a1)
    {
        this.a1 = a1;
    }

    public void SetA2(int a2)
    {
        this.a2 = a2;
    }

    public int GetN()
    {
        return n;
    }

    public int GetA1()
    {
        return a1;
    }

    public int GetA2()
    {
        return a2;
    }

    public void PrintSeries()
    {
        int a = a1;
        int b = a2;
        Console.Write(a + " - " + b);
        for (int i = 4; i <= n; i++)
        {
            int c = a + b;
            Console.Write(" - " + c);
            a = b;
            b = c;
        }
        
    }
}
