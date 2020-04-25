package com.sapient.marketdata.service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.sapient.marketdata.service.model.TradesModel;

@FeignClient(name = "refdata-service", url = "localhost:8083")
public interface RefdataFeign {
	
	@GetMapping("/trades")
	public ResponseEntity<List<TradesModel>> getTrades();
	
}
