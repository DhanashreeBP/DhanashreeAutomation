package com.myrestructure.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.myrestructure.utility.NewExcelLibrary;

public class DataProviders {

	
	NewExcelLibrary obj = new NewExcelLibrary();

	@DataProvider(name = "credentials")
	public Object[][] getCredentials() {
		// Totals rows count
		int rows = obj.getRowCount("Credentials");
		// Total Columns
		int column = obj.getColumnCount("Credentials");
		int actRows = rows -1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Credentials", j, i + 2);
			}
		}
		return data;
	}
	
	
	
	@DataProvider(name = "newUserDetailsData")
	public Object[][] accountCreation() {

		// Totals rows count
		int rows = obj.getRowCount("AddUserData");
		// Total Columns
		int column = obj.getColumnCount("AddUserData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("AddUserData", j, 1),
						obj.getCellData("AddUserData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	

	@DataProvider(name = "newThresholdDetailsData")
	public Object[][] thresholdCreation() {

		// Totals rows count
		int rows = obj.getRowCount("AddThresholdData");
		// Total Columns
		int column = obj.getColumnCount("AddThresholdData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("AddThresholdData", j, 1),
						obj.getCellData("AddThresholdData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	
//	@DataProvider(name = "newSimDetailsData")
//	public Object[][] simcardCreation() {
//
//		// Totals rows count
//		int rows = obj.getRowCount("AddSimCardData");
//		// Total Columns
//		int column = obj.getColumnCount("AddSimCardData");
//		int actRows = rows - 1;
//		//Created an object of array to store data
//		Object[][] data = new Object[actRows][1];
//		
//		for (int i = 0; i < actRows; i++) {
//			Map<String, String> hashMap = new HashMap<>();
//			for (int j = 0; j < column; j++) {
//				hashMap.put(obj.getCellData("AddSimCardData", j, 1),
//						obj.getCellData("AddSimCardData", j, i + 2));
//			}
//			data[i][0]=hashMap;
//		}
//		return data;
//	}
	
	
	
	@DataProvider(name = "newGroupDetailsData")
	public Object[][] groupCreation() {

		// Totals rows count
		int rows = obj.getRowCount("AddGroupData");
		// Total Columns
		int column = obj.getColumnCount("AddGroupData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("AddGroupData", j, 1),
						obj.getCellData("AddGroupData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	
	@DataProvider(name = "newGraphGroupDetailsData")
	public Object[][] graphCreation() {

		// Totals rows count
		int rows = obj.getRowCount("AddGraphData");
		// Total Columns
		int column = obj.getColumnCount("AddGraphData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("AddGraphData", j, 1),
						obj.getCellData("AddGraphData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "newLcdParameterDetailsData")
	public Object[][] lcdCreation() {

		// Totals rows count
		int rows = obj.getRowCount("AddLcdData");
		// Total Columns
		int column = obj.getColumnCount("AddLcdData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("AddLcdData", j, 1),
						obj.getCellData("AddLcdData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "newLcdDiffDetailsData")
	public Object[][] diffCreation() {

		// Totals rows count
		int rows = obj.getRowCount("AddLcdDiffData");
		// Total Columns
		int column = obj.getColumnCount("AddLcdDiffData");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("AddLcdDiffData", j, 1),
						obj.getCellData("AddLcdDiffData", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
}


