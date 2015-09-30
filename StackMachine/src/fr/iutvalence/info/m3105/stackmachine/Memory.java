package fr.iutvalence.info.m3105.stackmachine;

public class Memory 
{

	private int startAddress;
	private int endAddress;

	public Memory(int startAddress, int endAddress) throws InvalidParametersException
	{
		if (startAddress < 0 && endAddress < startAddress && (endAddress-startAddress) <1)
			throw new InvalidParametersException();
		
		this.startAddress = startAddress;
		this.endAddress = endAddress;
	}

	public int getStartAddress() {
		return this.startAddress;
	}

	public void write(int currentAddress, Object opCode) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void readAt(int address)
	{
		
	}

}
