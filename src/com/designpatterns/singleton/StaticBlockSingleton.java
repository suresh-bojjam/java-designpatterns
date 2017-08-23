package com.designpatterns.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton object;
	
	static{
		object=new StaticBlockSingleton();
	}
	
	public static Object getInstance(){
		return object;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
