package Decorator;

public class TShirt extends Decorator
{
    private int num;

    public TShirt(Component c)
    {
        super(c);
        this.num = 10;
    }

    public void incNum()
    {
        this.num = this.num + 1;
    }

    protected String Applyfoo(String a)
    {
        String out = a + "[Tshirt num: "+this.num+"]";
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
