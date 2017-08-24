package com.designpatterns.prototype;

import java.util.List;

public class TestRunner {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		TestData testData = new TestData();
		testData.loadData();
		
		//Use the clone method to get the test data to pass different test cases
		TestData testCase1Data = (TestData) testData.clone();
		TestData testCase2Data = (TestData) testData.clone();	
		
		testAlpha(testCase1Data);
		testBeta(testCase2Data);
	}
	
	private static void testAlpha(TestData testData){
		//test alpha requires additional data
		List<Item> list = testData.getItems();
		list.add(new Item("school bag",800,130,50));
		System.out.println("alpha test on data set size: "+list.size());
		//do run test case here
		
	}
	
	private static void testBeta(TestData testData){
		//test beta removing unnecessary data before performing the test
		List<Item> list = testData.getItems();
		list.remove(0);
		System.out.println("beta test on data set size: "+list.size());
		//do run test case here
	}
}
