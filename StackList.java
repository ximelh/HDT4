/***
 * StackList.java
 * @since 17/02/2022
 * Clase stack con list
 */

public class StackList<E> extends AbstractStack<E> {

    private LinkedList<E> stack;

    /**
     * Constructor.
     * Inicializa un stack de lista encadenada
     */
    public StackList(String list){ //el parametro llama la lista a ser creada
        ListFactory<E> lFactory = new ListFactory<E>();
        this.setStack(lFactory.getList(list));
    }
   
    /**
     * Obtiene el stack
     * @return stack
     */
    public LinkedList<E> getStack() {
        return stack;
    }
    
    public int size(){
        return stack.getSize();
    }

    /**
     *  Establece el stack
     * @param stack
     */
    public void setStack(LinkedList<E> stack) {
        this.stack = stack;
    }

    @Override
    public void add(E item) {
        // TODO Auto-generated method stub
        this.stack.insertLink(item);
        
    }

    /**
     * Elimina un elemento del stack
     * regresa el elemento eliminado
     */
    @Override
    public E remove() {
        // TODO Auto-generated method stub
        if (stack.isEmpty()){
            return null;
        } else {
            E e = stack.removeFirst();
            return e;
        }
    }

    /**
     * Regresa el ultimo elemento del stack
     */
    @Override
    public E peek() {
        // TODO Auto-generated method stub
        if (stack.isEmpty()){
            return null;
        } else {
            return stack.getFirstObj();
        }
    }

    /**
     * Revisa si el stack esta vacio
     */
    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return stack.isEmpty();
    }
    
}
