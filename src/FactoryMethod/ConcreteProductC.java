package FactoryMethod;

public class ConcreteProductC implements ProductBase
{
    @Override
    public void eating() //stub
    {
        System.out.println("\n[C]mmm good\n");
    }
    @Override
    public void sleeping() //stub
    {
        System.out.println("\n[C]Preparing to sleep... one sheep, two sheep, three sheep... night\n");
    }
    @Override
    public void drinking() //stub
    {
        System.out.println("\n[C]Drinking to recharge energy...\n");
    }
}
