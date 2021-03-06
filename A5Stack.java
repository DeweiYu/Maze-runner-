//
//Dewei Yu
//V00897211
public class A5Stack<T> implements Stack<T> {

    private Node<T> head;

    public A5Stack() {
        head = null;
    }

    /*
     * Purpose: Insert an item onto the top of the stack
     * Parameters: T - the item to insert 
     * Returns: Nothing
     */
    public void push(T v) {
        Node<T> node = new Node<T>(v);
        node.next = head;
        head = node;
    }

    /*
     * Purpose: Removes and returns the top item from the stack
     * Parameters: None
     * Returns: T - the data value of the element removed
     * Throws: EmptyStackException if stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Node<T>node=head;
        head=head.next;
        return node.getData();
    }

    /*
     * Purpose: Accesses the top item on the stack
     * Parameters: None
     * Returns: T - the data value of the top element
     * Throws: EmptyStackException if stack is empty
     */
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Node<T>node = head;
        return node.getData();
    }

    /*
     * Purpose: Determines whether the stack is empty
     * Parameters: None
     * Returns: boolean - true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return head==null;
    }

    /*
     * Purpose: Removes all elements from the stack 
     * Parameters: None
     * Returns: Nothing
     */
    public void popAll(){
        head = null;
    }

}
