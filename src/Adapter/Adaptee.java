package Adapter;

public class Adaptee
{
    private int num1;
    private boolean check;
    private float num2;

    public Adaptee(int a, boolean b, float c)
    {
        this.num1 = a;
        this.check = b;
        this.num2 = c;
    }

    public void op1_adaptee()
    {
        System.out.println("Op1 adaptee\n" + this.num1 + " " + this.check + " " + this.num2);
    }
    public void op2_adaptee()
    {
        System.out.println("Op2 adaptee\n" + this.num1 + " " + this.check + " " + this.num2);
    }
}
