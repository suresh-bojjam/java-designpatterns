package com.designpatterns.proxy;

public class Test {
	public static void main(String args[]) throws Exception{
		CommandExecutorProxy proxyExecutor=new CommandExecutorProxy("admin","password");
		proxyExecutor.runCommand("cmd");
	}
}
