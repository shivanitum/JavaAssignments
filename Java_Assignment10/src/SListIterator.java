public class SListIterator<T>
{
    Link head,last;
    class Link<T>
    {
        Link next;
        T data;
       Link(T data)
       {
           this.data=data;
           next=null;
       }
    }
     public void insertLink(T data)
     {
         Link<T> link=new Link<>(data);
         if(head==null)
         {
             head=link;
             System.out.println("added "+data+" to the list");
             return;
         }
         Link last = head;
         while (last.next != null)
             last = last.next;
         last.next =link ;
         System.out.println("added "+data+" to the list");
         return;
     }
     public void removeLink(T data)
     {
         if(head.data==data)
         {
             head=head.next;
             return;
         }
         Link link=head;
         while(link.next.data!=data)
             link=link.next;
         link.next=link.next.next;
         if(link.next!=null)
            link.next.next=null;
         System.out.println("removed "+data+ " from the list");
     }
    public String printList()
    {
        Link link = head;
        StringBuilder sb=new StringBuilder();
        while (link != null)
        {
            sb.append(link.data);
            sb.append(" ");
            link = link.next;
        }
        return sb.toString();
    }


}
