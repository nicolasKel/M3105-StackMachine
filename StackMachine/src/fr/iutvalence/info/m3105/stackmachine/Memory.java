package fr.iutvalence.info.m3105.stackmachine;

public class Memory 
{

	private int startAddress;
	private int endAddress;

	public Memory(int startAddress, int endAddress) {
		this.startAddress = startAddress;
		this.endAddress = endAddress;
	}

	public int getStartAddress() {
		return this.startAddress;
	}

	public void write(int currentAddress, Object opCode) {
		// TODO Auto-generated method stub
		
	}

}
