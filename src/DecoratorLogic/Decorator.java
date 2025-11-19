package DecoratorLogic;

public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component c) {
        this.component = c;
    }

    @Override
    public DressCode dress_code() {
        return component.dress_code();
    }
}

