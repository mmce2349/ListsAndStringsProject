package list.controller;

import java.util.List;
import java.util.ArrayList;
import list.model.Donut; //Must import because its from a different package
import list.view.PopupDisplay;

public class ListController 
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();// this is how you intialize a donut list.
		display = new PopupDisplay();
	}
	
	public void start()
	{
		System.out.println(donutList);
		donutList.add(new Donut());
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "cream filled ";
		for (int index = 0; index < donutList.size(); index+=1 )
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			if(currentFlavor.equals(favorite))
			{
				for(int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best flavor ever!!!!");
				}
			}
			
			display.displayText(donutList.get(index).toString());
		}
	}
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled ");
		Donut creamFilled = new Donut("cream filled ");
		Donut chocolate = new Donut("Chocolate ");
		Donut mapleBacon = new Donut("mapleBacon ");
		Donut glazed = new Donut("Glazed ");
		
		donutList.add(jellyFilled);
		donutList.add(creamFilled);
		donutList.add(chocolate);
		donutList.add(mapleBacon);
		donutList.add(glazed);
	}
	
}
