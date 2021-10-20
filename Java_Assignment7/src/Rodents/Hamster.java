package Rodents;

public class Hamster extends Rodent{
    Hamster()
    {
        System.out.println("I am a hamster") ;
    }
    @Override
    public void vocalizations() {
       System.out.println("I squeak like a hamster");
    }

    @Override
    public void biting() {
        System.out.println("I bite like a hamster");
    }

    @Override
    public void climbing() {
        System.out.println("I climb like a hamster");
    }
}
