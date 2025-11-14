package AbstractFactory_And_Singleton;

public class SeniorFourLeggedAnimal extends FourLeggedAnimal
{
    int age;
    public SeniorFourLeggedAnimal(int a, String b, int c) {
        super(a, b);
        this.age = c;
    }

    @Override
    public void animal_sound()
    {
        System.out.println("Senior animal with 4 leg roaaar ....\n");
    }

    @Override
    public void whoIam()
    {
        System.out.println("I'm senior animal with 4 leg:  " + getName()+"\n");
    }
}
