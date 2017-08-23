package com.designpatterns.factorypattern;

public class DynamoDBConnector extends Connector{
	
	private final String type="DYNAMO";
	String URL=null;
	Object connection=null;
	
	DynamoDBConnector(String URL,Object connection){
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
