package Rodents;

public class Main {



    public static void main(String args[])
    {
        Rodent rodents[]={new Hamster(),new Mouse(),new Squirrel()};
        for(int i=0;i<3;i++)
        {
            rodents[i].biting();
            rodents[i].climbing();
            rodents[i].vocalizations();
        }
    }
}
