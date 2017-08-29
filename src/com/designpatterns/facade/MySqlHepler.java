package com.designpatterns.facade;

import java.sql.Connection;

public class MySqlHepler {
	public static Connection getConnection(){
		return null;
	}

	public void generateHTMLReport(Connection conn){
		System.out.println("generating HTmL Report with MySQL");
		//get data from db and generate the report
	}

	public void generatePDFReport(Connection conn){
		System.out.println("generating PDF Report with MySQL");
		//get data from db and generate the report
	}
}