package com.designpatterns.singleton;

public class ThreadSafeOptimizedSingleton {

	private static ThreadSafeOptimizedSingleton object=null;

	public static Object getInstance(){
		if(object==null){
			synchronized(ThreadSafeOptimizedSingleton.class){
				if(object==null)object=new ThreadSafeOptimizedSingleton(); 
			}
		}
		return object;
	}
	
	public static void main(String[] args) {
		Object obj1=ThreadSafeOptimizedSingleton.getInstance();
		Object obj2=ThreadSafeOptimizedSingleton.getInstance();
		System.out.println(obj1.hashCode()==obj2.hashCode());
	}
}