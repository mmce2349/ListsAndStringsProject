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
//		showTheList();
		changeTheList();
		practiceWithList();
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
			for(int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex +=1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
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
	
	
	private void changeTheList() 
	{
		display.displayText(" The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list.");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
		

		
			
	}
	private void practiceWithList()
	{
		donutList.add(new Donut("chocolate filled"));
		Donut removed = donutList.remove(2);
		donutList.add(4, removed);
		display.displayText("The list has " + donutList.size() + " donuts.");
		donutList.add(new Donut());
		
		Donut remove = donutList.remove(7);
		remove = donutList.set(5, new Donut("Maple"));
		display.displayText("The donut with flavor " + remove.getFlavor() + " has been replaced.");
		display.displayText("The list is this big: " + donutList.size());
		
	}
	
}
