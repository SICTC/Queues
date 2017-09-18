
public class QueueLL implements Queue 
{
	private int count;
	
	private class node
	{
		public Object data;
		public node next;
	}
	
	private node front, back;
	
	public QueueLL()
	{
		makeEmpty();
	}
	
	public void enqueue(Object x)
	{
		node newnode = new node();
		newnode.data = x;
		newnode.next = null;
		
		if(back != null) //queue is not empty
		{
			back.next = newnode;
		}
		else //queue is empty
		{
			front = newnode;
		}
		
		back = newnode;
		count++;
	}
	
	public Object dequeue()
	{
		if(isEmpty())
		{
			return null;
		}
		
		Object dataToReturn = front.data;
		
		front = front.next;
		
		if(front == null) //if the queue is now empty
		{
			back = null;
		}
		
		count--;
		
		return dataToReturn;
	}
	
	public Object peek()
	{
		return (isEmpty())? null : front.data;
	}
	
	public boolean isEmpty()
	{
		return count<=0;
	}
	
	public boolean isFull()
	{
		return false;
	}
	
	public int size()
	{
		return count;
	}
	
	public void makeEmpty()
	{
		back=front=null;
		count = 0;
	}
}
