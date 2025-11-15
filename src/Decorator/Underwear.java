package Decorator;

public class Underwear extends Decorator
{
    private String type;

    public Underwear(Component c)
    {
        super(c);
        this.type = "type Underwear";
    }

    protected String Applyfoo(String a)
    {
        String out = a + "[Underwear type: "+this.type+"]";
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
