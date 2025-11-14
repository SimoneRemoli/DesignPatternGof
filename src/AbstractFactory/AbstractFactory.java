package AbstractFactory;

public abstract class AbstractFactory
{
    public static final String Type_Senior = "Senior";
    public static final String Type_NoSenior = "NoSenior";

    public static AbstractFactory getFactory(String s)
    {
        if(s.equals(Type_Senior))
        {
            return new SeniorFactory();
        }
        return new NoSeniorFactory();
    }

    public abstract Human createHuman();
    public abstract FourLeggedAnimal create4legsAnimal();
}
