package com.designpatterns.singleton;

public class EagerSingleton {

	private static EagerSingleton object=new EagerSingleton();
	
	public static Object getInstance(){
		return object;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
