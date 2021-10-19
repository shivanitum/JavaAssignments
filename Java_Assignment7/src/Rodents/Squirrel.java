package Rodents;

public class Squirrel extends Rodent{
    Squirrel()
    {
        System.out.println("I am a squirrel") ;
    }
    @Override
    public void climbing() {
       System.out.println("I climb like a squirrel") ;
    }

    @Override
    public void biting() {
        System.out.println("I bite like a squirrel") ;
    }

    @Override
    public void vocalizations() {
        System.out.println("I squeak like a squirrel") ;
    }
}
