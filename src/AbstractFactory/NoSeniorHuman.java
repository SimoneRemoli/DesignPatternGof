package AbstractFactory;

public class NoSeniorHuman extends Human
{
    int energy;

    public NoSeniorHuman(String a, String b, int c)
    {
        super(a, b);
        this.energy = c;
    }
    @Override
    public void eat()
    {
        System.out.println("No senior eating healthy ...\n");
    }
    @Override
    public void whoIam()
    {
        System.out.println("I'm no senior human " + this.getName()+" " + this.getSurname()+"\n");
    }
}
