package com.sapient.marketdata.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.marketdata.service.mapper.MetalsMapper;
import com.sapient.marketdata.service.model.MetalsModel;
import com.sapient.marketdata.service.repository.MetalsRepository;
import com.sapient.marketdata.service.service.MetalsService;

@Service
public class MetalsServiceImpl implements MetalsService {

	@Autowired
	private MetalsRepository metalsRepository;
	
	@Autowired
	private MetalsMapper metalsMapper;
	
	@Override
	public MetalsModel findByOne(Integer id) {
		
		return metalsMapper.apply(metalsRepository.findById(id).get());
	}

	@Override
	public List<MetalsModel> findAll() {
		
		return metalsMapper.apply(metalsRepository.findAll());
	}

}
