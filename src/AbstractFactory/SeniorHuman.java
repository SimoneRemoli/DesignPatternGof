package AbstractFactory;

public class SeniorHuman extends Human
{
    private int age;

    public SeniorHuman(String a, String b, int c) {
        super(a, b);
        this.age = c;
    }

    @Override
    public void eat()
    {
        System.out.println("Senior eating ... \n");
    }

    @Override
    public void whoIam()
    {
        System.out.println("I'm senior human " + this.getName()+" " + this.getSurname()+"\n");
    }
}
