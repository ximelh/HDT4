/***
 * DoubleLinkedList.java
 * Clase para hacer linked list doblemente encadenadas
 * @since 19/02/2022
 */

public class DoubleLinkedList<E> extends AbstractLinkedList<E>{

    private LinkDouble<E> firstLink;
    private LinkDouble<E> lastLink;


    /**
     * Constructor.
     * Inicializa una lista soblemente encadenada
     */
    DoubleLinkedList(){
    }


    /**
     * Ingresa algo al inicio de la lista doblemente encadenada
     * @param obj objeto a ingresar
     */
    public void insertLink(E obj){
        LinkDouble<E> theNewLink = new LinkDouble<E>(obj);
        if(this.firstLink == null){
            this.firstLink = this.lastLink = theNewLink;
            firstLink.setPrevious(null);
            lastLink.setNext(null);
            size +=1;
        } else {
            theNewLink.setNext(firstLink);
            firstLink.setPrevious(theNewLink);
            theNewLink.setPrevious(null);
            firstLink = theNewLink;
            size+=1;
        }
    }

    /**
     * Quita el primer link de la lista
     * @return primer link quitado
     */
    public E removeFirst(){
        LinkDouble<E> linkReference = firstLink;
        if(this.firstLink != null){
        	
            this.firstLink = this.firstLink.getNext();
            
            if(this.firstLink != null) {
            	this.firstLink.setPrevious(null);
            }
            size -=1;
        } 
        return linkReference.getObj();
    }

    /**
     * Obtiene el primer objeto de la lista
     * @return object
     */
    public E getFirstObj() {
        return firstLink.getObj();
    }

    /**
     * Obtiene el ultimo link de la lista
     * @return lastLink
     */
    public LinkDouble<E> getLastLink() {
        return lastLink;
    }

    /**
     * Establece el ultimo link de la lista
     * @param lastLink
     */
    public void setLastLink(LinkDouble<E> lastLink) {
        this.lastLink = lastLink;
    }

    /**
     * Obtiene el primer link de la lista
     * @return firstLink
     */
    public LinkDouble<E> getFirstLink() {
        return firstLink;
    }

    /**
     * Establece el primer link de la lista
     * @param firstLink
     */
    public void setFirstLink(LinkDouble<E> firstLink) {
        this.firstLink = firstLink;
    }

 


}
