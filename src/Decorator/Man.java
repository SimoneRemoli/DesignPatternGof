package Decorator;

public class Man extends Component
{
    private String name;
    public Man(String t)
    {
        this.name = t;
    }

    public void setText(String text) {
        this.name = text;
    }

    @Override
    public String dress_code()
    {
        return this.name;
    }
}
