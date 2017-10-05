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
		this.flavor = "Plain ";
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
	public String toString()
	{
		String description= "This donut is a " + flavor + "donut";
		
		return description;
	}
	
	public String getShape()//always have a return time for get
	{
		return shape; 
	}
	
	public void setShape(String shape)// always have a this.something = something
	{
		this.shape = shape;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
}
