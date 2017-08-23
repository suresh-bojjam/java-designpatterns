package com.designpatterns.factorypattern;

public class DriverManager {
	
	private Connector connector=null;
	public enum CONNECTOR_TYPE{
		GRAPH,DYNAMO,MYSQL
	} 
	
	public Object getConnector(String type){
		if(type.equals(CONNECTOR_TYPE.DYNAMO.toString()))
			connector=new DynamoDBConnector("http://DYNAMO_URL",null);
		if(type.equals(CONNECTOR_TYPE.GRAPH.toString()))
			connector=new GraphConnector("http://GRAPH_URL",null);
		if(type.equals(CONNECTOR_TYPE.MYSQL.toString()))
			connector=new MySQLConnector("http://MYSQL_URL",null);
		return connector;
	}
	
	public static void main(String args[]){
		DriverManager manager=new DriverManager();
		Connector connector=null;
		
		for(CONNECTOR_TYPE type:CONNECTOR_TYPE.values()){
			switch(type.toString()){
			case "GRAPH":
				connector=(Connector)manager.getConnector("GRAPH");
				System.out.println("type: "+connector.getType());
				break;
			case "DYNAMO":
				connector=(Connector)manager.getConnector("DYNAMO");
				System.out.println("type: "+connector.getType());
				break;
			case "MYSQL":
				connector=(Connector)manager.getConnector("MYSQL");
				System.out.println("type: "+connector.getType());
				break;
			}
		}

	}
}
