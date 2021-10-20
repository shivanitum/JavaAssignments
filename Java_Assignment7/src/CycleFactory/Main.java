package CycleFactory;

public class Main {
   static class CycleFactory
    {
        public Cycle getCycle(String cycleType)
        {
            if (cycleType==null)
                return null;
            else if(cycleType.equalsIgnoreCase("Unicycle"))
                return new Unicycle();
            else if(cycleType.equalsIgnoreCase("Bicycle"))
                return new Bicycle();
            else if(cycleType.equalsIgnoreCase("Tricycle"))
                return new Tricycle();
            return null;
        }
        public static void main(String args[])
        {
            CycleFactory cycleFactory=new CycleFactory();
            Cycle cycle=cycleFactory.getCycle("unicycle");
            cycle.ride();
             cycle=cycleFactory.getCycle("bicycle");
            cycle.ride();
            cycle=cycleFactory.getCycle("tricycle");
            cycle.ride();
        }
    }
}
