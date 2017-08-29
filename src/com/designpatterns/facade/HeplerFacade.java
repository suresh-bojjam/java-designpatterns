package com.designpatterns.facade;

import java.sql.Connection;

public class HeplerFacade {

	public static enum DB_TYPES{
		MY_SQL,ORACLE
	}

	public static enum REPORT_TYPE{
		PDF,HTML
	}

	public static void generateReport(DB_TYPES dbType,REPORT_TYPE reportType){
		Connection connection=getConnection(dbType);
		switch(dbType.toString()){
		case "MY_SQL":
			MySqlHepler mySQLHepler=new MySqlHepler();
			if(reportType.toString().equals("HTML"))
				mySQLHepler.generateHTMLReport(connection);

			if(reportType.toString().equals("PDF"))
				mySQLHepler.generatePDFReport(connection);
			break;
		case "ORACLE":
			OracleHelper oracleHepler=new OracleHelper();
			if(reportType.toString().equals("HTML"))
				oracleHepler.generateHTMLReport(connection);

			if(reportType.toString().equals("PDF"))
				oracleHepler.generatePDFReport(connection);
			break;
		}
	}

	public static Connection getConnection(DB_TYPES type){
		if(type.equals(DB_TYPES.MY_SQL)) return MySqlHepler.getConnection();
		if(type.equals(DB_TYPES.ORACLE)) return OracleHelper.getConnection();
		return null;
	}
}