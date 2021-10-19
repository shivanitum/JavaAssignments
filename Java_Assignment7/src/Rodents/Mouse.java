package Rodents;

public class Mouse extends Rodent{
    Mouse()
    {
        System.out.println("I am a mouse") ;
    }
    @Override
    public void climbing() {
     System.out.println("I climb as fast as a mouse");
    }

    @Override
    public void biting() {
        System.out.println("I bite like a mouse");
    }

    @Override
    public void vocalizations() {
        System.out.println("I squeak like a mouse");
    }
}
