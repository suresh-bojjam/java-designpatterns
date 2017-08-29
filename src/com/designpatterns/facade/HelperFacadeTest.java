package com.designpatterns.facade;

import com.designpatterns.facade.HeplerFacade.DB_TYPES;
import com.designpatterns.facade.HeplerFacade.REPORT_TYPE;

public class HelperFacadeTest {
	public static void main(String args[]){
		HeplerFacade obj=new HeplerFacade();
		obj.generateReport(DB_TYPES.MY_SQL, REPORT_TYPE.PDF);
	}
}