/**
    A class of Stack in a fixed-size array.
    @author Daniel Esparza
*/
public final class ArrayStack<T> implements StackInterface<T>
{
	private final T[] stack; 
	private int numberOfEntries = 0;
	private static final int DEFAULT_CAPACITY = 10;


	/** Creates an empty stack having a given capacity.
	@param desiredCapacity  The integer capacity desired. */
	public ArrayStack(int DEFAULT_CAPACITY)
	{
         // The cast is safe because the new array contains null entries
         @SuppressWarnings("unchecked")
         T[] tempStack = (T[])new Object[DEFAULT_CAPACITY]; // Unchecked cast
         stack = tempStack;
         numberOfEntries = 0;
         initialized = true;
	} // end constructor
	
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry)
	{
		if(numberOfEntries < 10)
		{
			stack[numberOfEntries] = newEntry;
			numberOfEntries++;
		}
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
			T temp = stack[numberOfEntries];
			stack[numberOfEntries] = null;
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
		   return stack[numberOfEntries];
   }
   
	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
   public boolean isEmpty()
   {
	   if (numberOfEntries == 0)
		   return true;
	   else 
		   return false;
   }
/** Removes all entries from this stack. */
   public void clear()
   {
	   for(int i = 10; i >= 0; i--)
		   stack[i] = null;
   }
   
}