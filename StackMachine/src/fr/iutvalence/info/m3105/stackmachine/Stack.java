package fr.iutvalence.info.m3105.stackmachine;

public class Stack {
	private int size;
	private int numberOfElement;

	public Stack(int size) 
	{
		this.size = size;
	}
	
	public void push() throws StackOverflowException
	{
		if(numberOfElement+1 > size)
			throw new StackOverflowException();
	}
	
	public void pop() throws StackUnderflowException
	{
		if (numberOfElement-1 < 0)
			throw new StackUnderflowException();
	}

}
