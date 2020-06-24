package com.example.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.model.Covid;

import com.example.repository.CovidDTO;

@Service
public class CovidService {
	
	@Autowired
	private CovidDTO dto;
	
	String line ="";
	
	public void saveCovidData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Corona Data.csv"));
			while((line=br.readLine())!=null)
			{
			String [] data=	line.split(",");
			//ArrayList<Object> array = new ArrayList<Object>();
			Covid c = new Covid();
		 
			c.setDate(data[0]);
			c.setLocation(data[1]);
			c.setNew_cases(data[2]);
			c.setNew_deaths(data[3]);
			c.setTotal_cases(data[4]);
			c.setTotal_deaths(data[5]);
			
			
			dto.save(c);
			
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Iterable<Covid> getCovidData() {
		
		return dto.findAll();
			
	}
public Optional<Covid> getDatafromDBById(@PathVariable int id) {
		
		
	return dto.findById(id);
				
	}

}
