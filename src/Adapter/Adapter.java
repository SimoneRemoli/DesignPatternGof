package Adapter;

public class Adapter implements Target
{
    private Adaptee s;
    public Adapter(Adaptee a)
    {
        this.s = a;
    }
    @Override
    public int FirstOperation() {
        this.s.op1_adaptee();
        return 10;
    }

    @Override
    public Boolean SecondOperation() {
        this.s.op2_adaptee();
        return false;
    }

}
