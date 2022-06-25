
package Project1ShoppingCartBag;


public interface SetInterface <T> {
    
   public int getCurrentSize();
   public boolean isEmpty();
   public boolean add(T item);
   public T remove();
   public boolean remove (T item);
   public void clear();
   
   public boolean contain (T item);
   public T[] toArray();
}