/**
 * LinkedList.java
 * Interfaz de linked lists
 * @since 19/02/2022
 */

public interface LinkedList<E> {
    public Object getFirstLink(); 
    public boolean isEmpty();
    public void insertLink(E obj);
    public E removeFirst();
    public E getFirstObj();
    public int getSize();
}
