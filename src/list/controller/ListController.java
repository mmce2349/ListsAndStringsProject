package list.controller;

import java.util.List;
import java.util.ArrayList;
import list.model.Donut; //Must import because its from a different package

public class ListController 
{
	private List<Donut> donutList;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();// this is how you intialize a donut list.
	}
	
	public void start()
	{
		System.out.println(donutList);
		donutList.add(new Donut());
	}
}
