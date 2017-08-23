package com.designpatterns.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton object=null;
	
	public static synchronized  Object getInstance(){
		if(object==null)
			object=new ThreadSafeSingleton();
		return object;
	}
	
	public static void main(String[] args) {
		

	}

}
