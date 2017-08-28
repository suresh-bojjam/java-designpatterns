package com.designpatterns.proxy;

public class CommandExecutorProxy implements CommandExecutor{
	
	private CommandExecutor executor;
	
	CommandExecutorProxy(String user,String password){
		if(user.equals("admin")&&password.equals("password")&& isAdmin("admin")){
			executor=new CommandExecutorImpl();
		}

		if(user.equals("user")&&password.equals("password")){
			executor=new CommandExecutorImpl();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.proxy.CommandExecutor#runCommand(java.lang.String)
	 */
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin("admin"))
			executor.runCommand(cmd);
		else{
			if(cmd.equals("rm"))System.out.println("non-admin users not allowed to execute the remove command");
		}
	}

	public static void main(String args){
		
	}

	boolean isAdmin(String user){
		return true;
	}
}