package com.designpatterns.singleton;

enum EnumSingleton {

	INSTANCE;

	public static EnumSingleton getInstance(){
		return INSTANCE;
	}
	
	public void doSomething(){
		System.out.println("Success");
	}
}

public class EnumSingletonTest{
	public static void main(String args[]){
		Object obj1=EnumSingleton.getInstance();
		Object obj2=EnumSingleton.getInstance();
		System.out.println(obj1.hashCode()==obj2.hashCode());
		EnumSingleton.INSTANCE.doSomething();
	}
} 

