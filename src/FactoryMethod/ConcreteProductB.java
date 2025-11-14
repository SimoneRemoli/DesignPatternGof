package FactoryMethod;

public class ConcreteProductB implements ProductBase
{
    @Override
    public void eating() //stub
    {
        System.out.println("\n[B]Crick crock\n");
    }
    @Override
    public void sleeping() //stub
    {
        System.out.println("\n[B]Fffffffffiuuu\n");

    }
    @Override
    public void drinking() //stub
    {
        System.out.println("\n[B]Blu Blu\n");
    }
}
