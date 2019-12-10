package com.sapient.marketdata.service.service;

import java.util.List;

import com.sapient.marketdata.service.model.MetalsModel;

public interface MetalsService {
	
	public MetalsModel findByOne(Integer id);
	
	public List<MetalsModel> findAll();
}
