package useful.controller;

import java.util.List;
import java.util.ArrayList;

import useful.model.Donut;
import useful.view.PopupDisplay;

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
		backwardsLoopDemo();
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
	
	
	public int maxLength(ArrayList<String>myList)
	{
		int max = 0;
		
		for(int index = 0; index < myList.size(); index +=1)
		{
			if (max < myList.get(index).length())
			{
				max = myList.get(index).length();
			}
		}
				
		return max;
	}
	
	public String getLongestString(ArrayList<String>myList) 
	{
		String longest = "";
		int max = 0;
		
		for (int index = 0; index < myList.size(); index +=1)
		{
			if (myList.get(index).length() > max)
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
		
		return longest;		
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
		
		for(int loop =0; loop < 12; loop += 1)
		{
			loop = donutList.size();
			display.displayText("I am adding more donuts. " + ( donutList.size()) + " out of a dozen");
			donutList.add(new Donut("Glazed"));			
		}
		display.displayText("This many donuts: " + donutList.size());

	}
	
	private void backwardsLoopDemo()
	{
		for( int index = donutList.size() - 1; index >= 0; index -=1)
		{
			display.displayText(donutList.get(index).getFlavor());
		}
		
		for(int index = 0; index < 12; index += 2)
		{
			display.displayText("This donut is " + donutList.get(index).getFlavor());
		}
		donutList.add(new Donut("cream Filled"));
		display.displayText("We now have: " + donutList.size() + ". This is a baker's dozen.");
		display.displayText("The last donut is: " + donutList.get(12).getFlavor());
		
	}
	
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
}
