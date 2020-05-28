package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CovidService;

@RestController
public class Controller {
	
	
@Autowired
private CovidService cs ;

@PostMapping(path="/feedCovidData")
public void setDatainDB() {
	cs.saveCovidData();
}

@GetMapping(path="/getCovidData")
public void getDatafromDB() {
	cs.getCovidData();
}

@GetMapping(path="/getCovidDataById/{id}")
public void getDataById(@PathVariable int id) {
	cs.getDatafromDBById(id);
}



}
