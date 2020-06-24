package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Covid;

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
public Iterable<Covid> getDatafromDB() {
	return cs.getCovidData();
}

@GetMapping(path="/getCovidDataById/{id}")
public Optional<Covid> getDataById(@PathVariable int id) {
	
	Optional<Covid> xyz = cs.getDatafromDBById(id);
	
	 if(xyz.toString().contains("empty")) {
         throw new RecordNotFoundException("Invalid covid id given : " + id);
    }
	 
	 return xyz;
	 
}

}




