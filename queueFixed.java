/**
    A class of Stack in a fixed-size array.
    @author Daniel Esparza
*/
public final class ArrayQueue<T> implements QueueInterface<T>
{
	private final T[] stack; 
	private int numberOfEntries = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private int start = 0;
	private int end = 0;


	/** Creates an empty stack having a given capacity.
	@param desiredCapacity  The integer capacity desired. */
	public ArrayQueue(int DEFAULT_CAPACITY)
	{
         // The cast is safe because the new array contains null entries
         @SuppressWarnings("unchecked")
         T[] tempQueue = (T[])new Object[DEFAULT_CAPACITY]; // Unchecked cast
         Queue = tempQueue;
         numberOfEntries = 0;
         initialized = true;
	} // end constructor
	
  /** Adds a new entry to the back of this queue.
      @param newEntry  An object to be added. */
	public void enqueue(T newEntry)
	{
		if(numberOfEntries < 10)
		{
			queue[numberOfEntries] = newEntry;
			numberOfEntries++;
			if(end == 9)
				end = 0
			else
				end++;
		}
	}
	
  /** Removes and returns the entry at the front of this queue.
      @return  The object at the front of the queue. 
      @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue()
	{
		if(isEmpty() == true)
			throw new EmptyQueueException("Stack is empty");
		else
		{
			T temp = queue[start];
			queue[start] = null;
			numberOfEntries--;
			if(start == 9)
				start = 0;
			else
				start++;
			return temp;
		}
	}
	
  /**  Retrieves the entry at the front of this queue.
      @return  The object at the front of the queue.
      @throws  EmptyQueueException if the queue is empty. */
   public T getFront()
   {
	   if (isEmpty() == true)
		   throw new EmptyStackException("Stack is empty");
	   else 
		   return queue[start];
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
	   for(int i = 0; i < 10; i++)
		   queue[i] = null;
   }
   
}