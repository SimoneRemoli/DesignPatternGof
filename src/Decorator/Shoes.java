package Decorator;

public class Shoes extends Decorator
{
    private int number;

    public Shoes(Component c)
    {
        super(c);
        this.number = 47;
    }

    protected String Applyfoo(String a)
    {
        String out = a + "[Shoes number: "+this.number+"]";
        return out;
    }

    @Override
    public String dress_code()
    {
        String preliminary = super.dress_code();
        preliminary = this.Applyfoo(preliminary);
        return preliminary;
    }
}
