/**
    A class of Stack in a fixed-size array.
    @author Daniel Esparza
*/
public final class NodeQueue<T> implements QueueInterface<T>
{
	private Node<T> firstN; 
	private int numberOfEntries = 0;
	private Node<T> free;
	private Node<T> back;


	/** Creates an empty queue having a given capacity.
	@param desiredCapacity  The integer capacity desired. */
	public NodeQueue()
	{
         firstN = new Node();
		 firstN.next = firstN;
		 
	} // end constructor
	
  /** Adds a new entry to the back of this queue.
      @param newEntry  An object to be added. */
	public void enqueue(T newEntry)
	{
		if (numberOfEntries != 10)
		{
			Node<T> oldN = firstN;
			firstN = new Node<T>();
			firstN.item = newEntry;
			firstN.next = oldN;
			back = firstN;
			front.next = back;
			numberOfEntries++
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
			T temp = front.item;
			while(firstN.next != front)
			{
				firstN.next = end.next;
				firstN.next = firstN.next;
			}		
			front = firstN;
			numberOfEntries--;
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
	   {
		   while(firstN.next != free)
			{
				firstN.next = end.next;
				firstN.next = firstN.next;
			}		
		   return firstN;
	   }
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
	    if (firstN == true)
		   firstN.data = null;
	   else 
	   {
		   firstN.data = null;
		   firstN = firstN.next;
		   clear();
		   firstN.next = null;
   }
   
}