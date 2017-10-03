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
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut creamFilled = new Donut("cream filled");
		Donut chocolate = new Donut("Chocolate");
		Donut mapleBacon = new Donut("mapleBacon");
		Donut glazed = new Donut("Glazed");
		
		donutList.add(jellyFilled);
		donutList.add(creamFilled);
		donutList.add(chocolate);
		donutList.add(mapleBacon);
		donutList.add(glazed);
	}
	
}
