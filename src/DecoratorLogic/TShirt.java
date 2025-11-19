package DecoratorLogic;

public class TShirt extends Decorator {

    public TShirt(Component c) {
        super(c);
    }

    @Override
    public DressCode dress_code() {
        DressCode d = super.dress_code();
        d.isFormal = false;   // LOGICA REALE
        return d;
    }
}

