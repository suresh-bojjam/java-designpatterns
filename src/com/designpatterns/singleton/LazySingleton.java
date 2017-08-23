package com.designpatterns.singleton;

public class LazySingleton {

	private static LazySingleton object=null;
	
	public static Object getInstance(){
		if(object==null)
			object=new LazySingleton();
		return object;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
