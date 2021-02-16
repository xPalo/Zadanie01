package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args)
    {

        //System.out.println("Ola world");

        int cislo = 12;
        double realne = 1.5;

        System.out.println("12 + 1.5 = " + scitaj(cislo, realne));
    }

    public static double scitaj(int a, double b)
    {
        return a + b;
    }
}
