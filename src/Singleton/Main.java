package Singleton;

public class Main
{
    public static void main(String args[])
    {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();

        System.out.println("Equals Instance = " + (s1 == s2));

        System.out.println("s1: " + s1.getSingletonData1()+ " " + s1.getSingletonDataN());
        s1.setSingletonData1(20);
        s1.setSingletonDataN("Dad");
        System.out.println("s2: " + s2.getSingletonData1()+ " " + s2.getSingletonDataN());
        s2.setSingletonData1(100);
        s2.setSingletonDataN("Uncle");
        System.out.println("s1: " + s1.getSingletonData1()+ " " + s1.getSingletonDataN());

        System.out.println("Equals Instance = " + (s1 == s2));

    }
}
