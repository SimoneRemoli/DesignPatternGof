package AbstractFactory_And_Singleton;

public class NoSeniorFourLeggedAnimal extends FourLeggedAnimal
{
    int energy;

    public NoSeniorFourLeggedAnimal(int a, String b, int c) {
        super(a, b);
        this.energy = c;
    }

    @Override
    public void animal_sound()
    {
        System.out.println("No senior animal with 4 leg roaaar ....\n");
    }

    @Override
    public void whoIam()
    {
        System.out.println("I'm no senior animal with 4 leg " + getName()+ "\n");
    }
}
