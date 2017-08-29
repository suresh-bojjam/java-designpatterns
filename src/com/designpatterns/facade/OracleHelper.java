package com.designpatterns.facade;

import java.sql.Connection;

public class OracleHelper {
	
	public static Connection getConnection(){
		return null;
	}

	public void generateHTMLReport(Connection conn){
		System.out.println("generating HTML Report with ORACLE");
		//get data from db and generate the report
	}
	
	public void generatePDFReport(Connection conn){
		System.out.println("generating PDF Report with ORACLE");
		//get data from db and generate the report
	}
}