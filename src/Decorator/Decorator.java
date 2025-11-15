package Decorator;

public abstract class Decorator extends Component
{
    private Component component;

    public Decorator(Component c)
    {
        this.component = c;
    }

    @Override
    public String dress_code()
    {
        String result = this.component.dress_code();
        return result;
    }
}
