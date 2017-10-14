/**
    A class of Stack in a fixed-size array.
    @author Daniel Esparza
*/
public final class ArrayStack<T> implements StackInterface<T>
{
	private final Node<T> firstN; 
	private int numberOfEntries = 0;


	/** Creates an empty stack having a given capacity.
	@param desiredCapacity  The integer capacity desired. */
	public NodeStack()
	{
		firstN = null;
	} // end constructor
	
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry)
	{
		Node<T> oldN = firstN;
		firstN = new Node<T>();
        firstN.item = newEntry;
        firstN.next = oldN;
		numberOfEntries++
	}
	
	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. 
    @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop()
	{
		if(isEmpty() == true)
			throw new EmptyStackException("Stack is empty");
		else
		{
			T temp = firstN.item;
			firstN = firstN.next;
			numberOfEntries--;
			return temp;
		}
			
	}
	
	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.
    @throws  EmptyStackException if the stack is empty. */
   public T peek()
   {
	   if (isEmpty() == true)
		   throw new EmptyStackException("Stack is empty");
	   else 
		   return firstN.item;;
   }
   
	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
   public boolean isEmpty()
   {
	   if (firstN == true)
		   return true;
	   else 
		   return false;
   }
/** Removes all entries from this stack. */
   public void clear()
   {
	   if (firstN == true)
		   firstN.data = null;
	   else 
	   {
		   firstN.data = null;
		   firstN = firstN.next;
		   clear();
   }
   
}