package Ds1;

public class StackDemo {
	private int arr[];
	private int capacity;
	private int top;
	
	//Create stack
	StackDemo(int size)
	{
		arr=new int[5];
		capacity=size;
		top=-1;
	}
	//add elements
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Overs\n Program terminated");
			System.exit(1);
		}
		System.out.println("Inserting element"+x);
		arr[++top]=x;
	}
	//remove elements
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			System.exit(1);
		}
		return arr[top--];
	}
	//return size
	public int size()
	{
		return top+1;
	}
	//check is empty
	public boolean isEmpty()
	{
		return top==-1;
	}
	//check is full
	public boolean isFull()
	{
		return top==capacity-1;
	}
	//print stack
	public void printStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[]args)
	{
		StackDemo s=new StackDemo(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		s.pop();
		System.out.println("after pop out");
		s.printStack();
		
	}

}
