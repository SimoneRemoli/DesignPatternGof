package AbstractFactory_And_Singleton;

public class NoSeniorFactory extends AbstractFactory
{
    @Override
    public Human createHuman() {
        return new NoSeniorHuman("Alex", "Bianchi", 1000);
    }

    @Override
    public FourLeggedAnimal create4legsAnimal() {
        return new NoSeniorFourLeggedAnimal(2009, "Slim", 1000);
    }
}
