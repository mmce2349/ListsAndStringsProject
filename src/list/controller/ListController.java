package list.controller;

import java.util.List;
import java.util.ArrayList;
import list.model.Donut;

public class ListController 
{
	private List<Donut> donutList;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	public void start()
	{
		System.out.println(donutList);
		donutList.add(new Donut());
	}
}
