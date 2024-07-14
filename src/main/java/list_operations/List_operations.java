
package list_operations;
import java.util.*;

public class List_operations {
    public static void show_arraylist (ArrayList<Integer> a){
        ArrayList<Integer> arraylist=a;
        
        for(int x:arraylist){
            System.out.print(" "+x);
        }
        System.out.println();
        
    }
    public static void show_linklist (LinkedList<Integer> b){
        LinkedList<Integer> linklist=b;
        
        for(int x:linklist){
            System.out.print(" "+x);
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        
      ArrayList<Integer> arraylist= new ArrayList <>();
      LinkedList<Integer>linklist=new LinkedList<>();
      
      for (int i=10; i<=50;i=i+10){
           arraylist.add(i);
      }
     
          System.out.println("initial arraylist :");
          show_arraylist(arraylist);
          
           for (int i=1; i<=5;i++){
           linklist.add(i);
      }
         
         System.out.println("initial linklist :");
          show_linklist(linklist);
          
          int arraylist_size = arraylist.size();
          System.out.println("the size of arraylist :"+arraylist_size);
          int linklist_size =linklist.size();
           System.out.println("the size of linklist :"+linklist_size);
          
          int arraylist_element= arraylist.get(1);
          System.out.println("the element of index 1 of arraylist : "+arraylist_element);
          int linklist_element =linklist.get (1);
           System.out.println("the element of index 1 of linklist : "+linklist_element);
           
           
           arraylist.set(2,33);
           System.out.println("after setting a value at index 2 at arraylist :");
           show_arraylist(arraylist);
           
           linklist.set(2,100);
            System.out.println("after setting a value at index 2 at linklist:");
            show_linklist(linklist);
            
            
           arraylist.remove(3);
            System.out.println("after removing a value from arraylist :");
           show_arraylist(arraylist);
           
           linklist.remove(3);
           System.out.println("after removing a value from linklist :");
           show_linklist(linklist);
           
           
           Collections.sort(arraylist);
           System.out.println("after sorting arraylist : ");
           show_arraylist(arraylist);
           
           Collections.sort(linklist);
           System.out.println("after sorting linklist : ");
           show_linklist(linklist);
           
           
           
       
    }
}
