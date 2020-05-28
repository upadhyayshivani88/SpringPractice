package com.example.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Covid {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	private String date  ;
	private String location;
	private String new_cases ;
	private String new_deaths ;
	private String total_cases ;
	private String total_deaths ;
	
	public int getId() {
		return id;
	}
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getNew_cases() {
		return new_cases;
	}


	public void setNew_cases(String new_cases) {
		this.new_cases = new_cases;
	}


	public String getNew_deaths() {
		return new_deaths;
	}


	public void setNew_deaths(String new_deaths) {
		this.new_deaths = new_deaths;
	}


	public String getTotal_cases() {
		return total_cases;
	}


	public void setTotal_cases(String total_cases) {
		this.total_cases = total_cases;
	}


	public String getTotal_deaths() {
		return total_deaths;
	}


	public void setTotal_deaths(String total_deaths) {
		this.total_deaths = total_deaths;
	}


	@Override
	public String toString() {
		return "Covid [date=" + date + ", location=" + location + ", new_cases=" + new_cases + ", new_deaths="
				+ new_deaths + ", total_cases=" + total_cases + ", total_deaths=" + total_deaths + "]";
	}
	
	
	

}
