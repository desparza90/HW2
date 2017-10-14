import java.util.Vector;
/**
    A class of Stack in a fixed-size array.
    @author Daniel Esparza
*/
public final class ArrayStack<T> implements StackInterface<T>
{
	private final Vector V; 
	private int numberOfEntries = 0;


	/** Creates an empty stack having a given capacity.
	@param desiredCapacity  The integer capacity desired. */
	public VectorStack()
	{
		V = new Vector(10, 2);
	} // end constructor
	
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry)
	{
		V.addElement(newEntry);
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
			T temp = V.get(numberOfEntries);
			V.elementAt(numberOfEntries) = null;
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
		   return V.elementAt(numberOfEntries);
   }
   
	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
   public boolean isEmpty()
   {
	   if (V.isEmpty() == true)
		   return true;
	   else 
		   return false;
   }
/** Removes all entries from this stack. */
   public void clear()
   {
	   V.clear();
   }
   
}