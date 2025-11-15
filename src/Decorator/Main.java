package Decorator;
public class Main
{
    public static void main(String[] args)
    {
        Component dressed = new TShirt(new Underwear(new Eyeglasses(new Shoes(new Man("Guglielmo")))));
        System.out.println(dressed.dress_code());
    }
}
