package DecoratorLogic;

public class Man extends Component
{
    @Override
    public DressCode dress_code() {
        DressCode d = new DressCode();
        d.styleLevel = 1;
        d.isFormal = false;
        return d;
    }
}

