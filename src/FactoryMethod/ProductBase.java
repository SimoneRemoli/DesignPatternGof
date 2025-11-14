package FactoryMethod;

public interface ProductBase
{
    void eating();
    void sleeping();
    void drinking();
}

/*
Instead of using an interface, an abstract class can also be adopted.
In this case, the abstract class is extended by the concrete products,
providing shared behavior while still enforcing the implementation
of specific methods.
 */


