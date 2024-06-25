package com.rays.OOP;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	String fullName;
	String city;
	int age;
	int date1;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int findAge(int year, int month, int day) {

		LocalDate todayDate = LocalDate.now();

		LocalDate bitdate = LocalDate.of(year, month, day);

		Period p = Period.between(bitdate, todayDate);

		return p.getYears();

	}

}
