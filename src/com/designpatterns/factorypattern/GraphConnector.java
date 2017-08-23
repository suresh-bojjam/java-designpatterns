package com.designpatterns.factorypattern;

public class GraphConnector extends Connector{
	private final String type="GRAPH";
	String URL=null;
	Object connection=null;
	
	GraphConnector(String URL,Object connection){
		this.URL=URL;
		this.connection=connection;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	@Override
	public String getURL() {
		return this.URL;
	}
	
	@Override
	public Object getConnection() {
		return this.connection;
	}
	
}
