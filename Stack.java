interface Stack<T> {
	
	/*
	 * Purpose: Insert an item onto the top of the stack
	 * Parameters: T - the item to insert 
	 * Returns: Nothing
	 */
	public void push(T v); 
	
	/*
	 * Purpose: Removes and returns the top item from the stack
	 * Parameters: None
	 * Returns: T - the data value of the element removed
	 * Throws: EmptyStackException if stack is empty
	 */
	public T pop();
	
	/*
	 * Purpose: Accesses the top item on the stack
	 * Parameters: None
	 * Returns: T - the data value of the top element
	 * Throws: EmptyStackException if stack is empty
	 */
	public T top();	
	
	/*
	 * Purpose: Determines whether the stack is empty
	 * Parameters: None
	 * Returns: boolean - true if the stack is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/*
	 * Purpose: Removes all elements from the stack 
	 * Parameters: None
	 * Returns: Nothing
	 */
	public void popAll();

}