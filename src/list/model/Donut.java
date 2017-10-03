package list.model;

public class Donut 
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holecount;
	
	public Donut()
	{
		this.flavor = "Plain";
		this.shape = "Round";
		this.holecount = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;
	}
}
