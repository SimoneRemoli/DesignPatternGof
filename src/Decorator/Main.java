package Decorator;
public class Main
{
    public static void main(String[] args)
    {
        Man a = new Man("John");
        Shoes s = new Shoes(a);
        Eyeglasses e = new Eyeglasses(s);
        Underwear u = new Underwear(e);
        TShirt t = new TShirt(u);
        //t.incNum();
        Component c = t;
        System.out.println(c.dress_code());






        /*Component dressed = new TShirt(new Underwear(new Eyeglasses(new Shoes(new Man("Guglielmo")))));
        System.out.println(dressed.dress_code());
        Component dressed2 = new Underwear(new TShirt(new Shoes(new Eyeglasses(new Man("Guglielmo")))));
        System.out.println(dressed2.dress_code());
        */

    }
}
