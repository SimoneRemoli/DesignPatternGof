package AbstractFactory_And_Singleton;

public abstract class Human
{
    private String name, surname;

    public Human(String a, String b)
    {
        this.name = a;
        this.surname = b;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void eat();
    public abstract void whoIam();
}
