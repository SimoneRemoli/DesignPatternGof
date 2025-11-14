package Singleton;

public class Singleton
{
    private int singletonData1;
    private String singletonDataN;

    private static class Container
    {
        public final static Singleton instance = new Singleton(10, "Mum");
    }
    protected Singleton(int a, String b)
    {
        this.singletonData1 = a;
        this.singletonDataN = b;
    }
    public static final Singleton getSingletonInstance()
    {
        return Container.instance;
    }

    public void setSingletonData1(int singletonData1) {
        this.singletonData1 += singletonData1;
    }

    public void setSingletonDataN(String singletonDataN) {
        this.singletonDataN = this.singletonDataN.concat(" " + singletonDataN);
    }

    public int getSingletonData1() {
        return singletonData1;
    }

    public String getSingletonDataN() {
        return singletonDataN;
    }
}
