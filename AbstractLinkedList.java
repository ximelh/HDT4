/***
 * AbstractLinkedList.java
 * Clase abstracta de las list
 * @since 19/02/2022
 */

public abstract class AbstractLinkedList<E> implements LinkedList<E> {
    
    protected int size = 0;

    /**
     * Regresa si la lista esta vacia
     * @return true vacia, false no vacia
     */
    public boolean isEmpty(){
        return(getSize()==0);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
