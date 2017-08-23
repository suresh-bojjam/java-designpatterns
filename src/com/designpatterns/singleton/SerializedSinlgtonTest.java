package com.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSinlgtonTest{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
			SerializedSingleton object1=(SerializedSingleton) SerializedSingleton.getInstance();
			
			//Serialization
			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("hibernate.ser"));
			out.writeObject(object1);
			out.close();

			//Deserialization
			ObjectInput in=new ObjectInputStream(new FileInputStream("hibernate.ser"));
			SerializedSingleton object2=(SerializedSingleton)in.readObject();
			in.close();
			System.out.println("compare Objects: "+(object1.hashCode()==object2.hashCode()));
	}
}