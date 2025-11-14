package FactoryMethod;

public class ConcreteProductA implements ProductBase
{
    @Override
    public void eating() //stub
    {
        System.out.println("\n[A]gnam gnam\n");
    }
    @Override
    public void sleeping() //stub
    {
        System.out.println("\n[A]Bzzzzzz\n");
    }
    @Override
    public void drinking() //stub
    {
        System.out.println("\n[A]Glu glu\n");
    }
}
