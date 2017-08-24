package com.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/*
 * TestData Object loads the test data from DB and used for run the different test cases
 * Using prototype we clone the TestData object for different test cases instead of creating new and loads the data from DB for every time.
 * */

class Item{
	
	Item(String name,int cost,int soldOnLastMonth,int averageSellingCountForMonth){
		this.name=name;
		this.cost=cost;
		this.soldOnLastMonth=soldOnLastMonth;
		this.averageSellingCountForMonth=averageSellingCountForMonth;
	}
	
	private String name;
	private int cost;
	private int soldOnLastMonth;
	private int averageSellingCountForMonth;
}

public class TestData implements Cloneable{

	private List<Item> items;

	TestData(){
		this.items=new ArrayList<Item>();
	}
	
	TestData(List<Item> testSampleItems){
		this.items=testSampleItems;
	}
	
	public void loadData(){
		items.add(new Item("pen",25,240,100));
		items.add(new Item("book",20,140,240));
		items.add(new Item("pencil",15,200,120));
	}
	
	public List<Item> getItems(){
		return this.items;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<Item> temp = new ArrayList<Item>();
		for(Item item : this.getItems()){
			temp.add(item);
		}
		return new TestData(temp);
	}
}
