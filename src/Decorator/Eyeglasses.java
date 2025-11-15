package Decorator;

public class Eyeglasses extends Decorator
{
    private String model;

    public Eyeglasses(Component c)
    {
        super(c);
        this.model = "model Eyeglasses";
    }

    protected String Applyfoo(String a)
    {
        String out = a + "[Eyeglasses model: "+this.model+"]";
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
