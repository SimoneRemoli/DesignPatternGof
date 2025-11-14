package Adapter;

public class Main
{
    public static void main(String args[])
    {
        Adaptee s1 = new Adaptee(1,true, 3.09F);

        Target a = new Adapter(s1); //adapt the adaptee as target
        //client use target

        a.FirstOperation();
        a.SecondOperation();
    }
}

/*
It: All’interno dei metodi dell’Adapter
(ossia quelli ereditati dall’interfaccia Target)
vengono invocati i metodi dell’Adaptee, grazie
all’aggregazione dell’Adaptee all’interno
dell’Adapter stesso.


En: Within the methods of the Adapter
(i.e., those inherited from the Target interface),
the Adapter invokes the Adaptee’s methods by
leveraging the aggregation of the
Adaptee inside the Adapter itself.
 */
