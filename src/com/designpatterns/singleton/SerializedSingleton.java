package com.designpatterns.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	
	private static class Singleton{
		private static final SerializedSingleton object=new SerializedSingleton();
	}
	
	public static Object getInstance(){
		return Singleton.object;
	}	
	
	protected Object readResolve() {
	    return getInstance();
	}
	
	public static void main(String args[]){
		Object object1=SerializedSingleton.getInstance();
		Object object2=SerializedSingleton.getInstance();
		System.out.println(object1.hashCode()==object2.hashCode());
	}
}