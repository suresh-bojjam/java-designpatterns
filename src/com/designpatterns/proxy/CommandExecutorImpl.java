package com.designpatterns.proxy;

public class CommandExecutorImpl implements CommandExecutor{

	
	/* (non-Javadoc)
	 * @see com.designpatterns.proxy.CommandExecutor#runCommand(java.lang.String)
	 */
	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println("command executed Succssfully");		
	}
}
