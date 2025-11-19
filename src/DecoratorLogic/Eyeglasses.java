package DecoratorLogic;

public class Eyeglasses extends Decorator {

    public Eyeglasses(Component c) {
        super(c);
    }

    @Override
    public DressCode dress_code() {
        DressCode d = super.dress_code();
        d.isFormal = true;   // LOGICA REALE
        d.styleLevel += 1;
        return d;
    }
}

