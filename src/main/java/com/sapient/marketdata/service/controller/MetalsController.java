package com.sapient.marketdata.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.marketdata.service.model.MetalsModel;
import com.sapient.marketdata.service.service.MetalsService;

@RestController
public class MetalsController {
	
	@Autowired
	private MetalsService metalsService;
	
	@GetMapping("/metals/{id}")
	public ResponseEntity<MetalsModel> getMetal(@PathVariable Integer id){
		return ResponseEntity.ok(metalsService.findByOne(id));
	}
	
	@GetMapping("/metals")
	public ResponseEntity<List<MetalsModel>> getMetals(){
		return ResponseEntity.ok(metalsService.findAll());
	}
}
