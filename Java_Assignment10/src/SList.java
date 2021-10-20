
public class SList<T>
{
SListIterator sListIterator;

   public SListIterator getIterator(SListIterator sListIterator)
   {

       this.sListIterator=sListIterator;
       return sListIterator;

   }
   public String toString(){
       return sListIterator.printList();

   }

}
