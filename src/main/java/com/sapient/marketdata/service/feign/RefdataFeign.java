package com.sapient.marketdata.service.feign;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.sapient.marketdata.service.model.TradesModel;

//@FeignClient(name = "refdata-service", url = "localhost:8083")
@FeignClient(name = "refdata-service")
@RibbonClient(name = "refdata-service")
public interface RefdataFeign {
	
	@GetMapping("/trades")
	public ResponseEntity<List<TradesModel>> getTrades();
	
}
