package FactoryMethod;

public class Factory
{
    public ProductBase getInstance(int type) throws Exception
    {
        switch(type)
        {
            case 1 -> {
                return new ConcreteProductA();
            }
            case 2 -> {
                return new ConcreteProductB();
            }
            case 3 -> {
                return new ConcreteProductC();
            }
            case 4 -> {
                return new ConcreteProductA1();
            }
            default -> {
                throw new Exception("Invalid type : " + type);
            }
        }
    }
}
