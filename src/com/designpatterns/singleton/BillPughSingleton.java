package com.designpatterns.singleton;

public class BillPughSingleton {
	
	private static class Singleton{
		private static final BillPughSingleton object=new BillPughSingleton();
	}
	
	public static Object getInstance(){
		return Singleton.object;
	}

	public static void main(String[] args) {
		//testing the code
		Object obj1=BillPughSingleton.getInstance();
		Object obj2=BillPughSingleton.getInstance();
		System.out.println(obj1.hashCode()==obj2.hashCode());
	}

}
