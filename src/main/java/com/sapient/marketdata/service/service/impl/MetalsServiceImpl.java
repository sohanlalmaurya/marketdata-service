package com.sapient.marketdata.service.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.marketdata.service.feign.RefdataFeign;
import com.sapient.marketdata.service.mapper.MetalsMapper;
import com.sapient.marketdata.service.model.MetalsModel;
import com.sapient.marketdata.service.repository.MetalsRepository;
import com.sapient.marketdata.service.service.MetalsService;

@Service
public class MetalsServiceImpl implements MetalsService {

	private static Logger log = LoggerFactory.getLogger(MetalsServiceImpl.class);
	
	@Autowired
	private MetalsRepository metalsRepository;
	
	@Autowired
	private RefdataFeign refdataFeign;
	
	@Autowired
	private MetalsMapper metalsMapper;
	
	@Override
	public MetalsModel findByOne(Integer id) {
		
		return metalsMapper.apply(metalsRepository.findById(id).get());
	}

	@Override
	public List<MetalsModel> findAll() {
		log.info("refdataFeign Details : {}", refdataFeign.getTrades().getBody());
		return metalsMapper.apply(metalsRepository.findAll());
	}

}
