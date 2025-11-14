package AbstractFactory_And_Singleton;

public abstract class FourLeggedAnimal
{
    private int Ybirth;
    private String name;

    public FourLeggedAnimal(int a, String b)
    {
        this.Ybirth = a;
        this.name = b;
    }

    public int getYbirth() {
        return Ybirth;
    }

    public String getName() {
        return name;
    }

    public abstract void animal_sound();
    public abstract void whoIam();
}
