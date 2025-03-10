package busRes;

public class Bus {
	private int busNo;
	private boolean Ac;
	private int capacity;
	
	Bus(int no,boolean Ac,int cap)
	{
		this.busNo=no;
		this.Ac=Ac;
		this.capacity=cap;
	}
	public int getbusNo()
	{
		return busNo;
	}
	public boolean isAc()
	{
		return Ac;
	}
	public void setAc(boolean val)
	{
		val=Ac;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity=cap;
	}
	
	

}
