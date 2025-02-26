package org.asd;

import org.testng.annotations.Test;

import Datadriven.writedata;

public class writetextexcel {
	 
	
	writedata obj= new writedata();
	 
	 @Test
	 public void writeExcelTest() throws Exception {
	  obj.writeExcel("Test", "Male", 0, 4);
	 }
	 
	/* @Test
	 public void writeExcelTest1() throws Exception {
	  obj.writeExcel("Test", "Female", 1, 2);
	 }*/
}
