package AbstractFactory_And_Singleton;

public abstract class AbstractFactory
{
    public static final String Type_Senior = "Senior";
    public static final String Type_NoSenior = "NoSenior";

    public static AbstractFactory instance;

    public static AbstractFactory getFactory(String s)
    {
        if(instance==null)
        {
            switch(s)
            {
                case "Senior" -> {

                    instance = new SeniorFactory();

                }
                case "NoSenior" -> {

                    instance = new NoSeniorFactory();
                }
                default -> throw new IllegalArgumentException("No Style");
            }
        }
        return instance;
    }

    public abstract Human createHuman();
    public abstract FourLeggedAnimal create4legsAnimal();
}
