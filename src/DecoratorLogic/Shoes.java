package DecoratorLogic;

public class Shoes extends Decorator {

    public Shoes(Component c) {
        super(c);
    }

    @Override
    public DressCode dress_code() {
        DressCode d = super.dress_code();
        d.styleLevel += 2;   // LOGICA REALE
        return d;
    }
}

