package AbstractFactory;

public class SeniorFactory extends AbstractFactory
{
    @Override
    public Human createHuman() {
        return new SeniorHuman("Gianfranco", "Marini", 65);
    }
    @Override
    public FourLeggedAnimal create4legsAnimal()
    {
        return new SeniorFourLeggedAnimal(2011, "Chip", 12);
    }
}
