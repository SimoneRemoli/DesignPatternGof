package AbstractFactory_And_Singleton;

public class Main
{
    public static void main(String[] args)
    {
        AbstractFactory seniorType = AbstractFactory.getFactory("Senior"); //seniorType =  SeniorFactory (concrete factory)
        AbstractFactory NoseniorType = AbstractFactory.getFactory("NoSenior"); ////NoseniorType =  NoSeniorFactory (concrete factory)

        space();

        Human human =  seniorType.createHuman(); //human (abstract product) = (concreteProduct) SeniorHuman
        FourLeggedAnimal fourLeg = seniorType.create4legsAnimal();
        human.eat();
        human.whoIam();
        fourLeg.animal_sound();
        fourLeg.whoIam();

        System.out.println("----------------------------");

        Human human2 = NoseniorType.createHuman();
        FourLeggedAnimal fourLeg2 = NoseniorType.create4legsAnimal();
        human2.eat();
        human2.whoIam();
        fourLeg2.animal_sound();
        fourLeg2.whoIam();

    }

    private static void space(){ System.out.println();};
}
