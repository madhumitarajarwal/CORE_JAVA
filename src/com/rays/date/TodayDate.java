package com.rays.date;
import java.util.Date;

public class TodayDate {
	public static void main(String[] args) {
		long fifteenMin = 15*60*1000;   //thu jan 01 05:45:00 ist 1970
		Date d =new Date(fifteenMin);
		
		  System.out.println(d);  //sat jun 29 15:46:03 ist 2024
		  
	}
  
}
