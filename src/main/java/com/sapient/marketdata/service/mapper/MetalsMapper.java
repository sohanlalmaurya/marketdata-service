package com.sapient.marketdata.service.mapper;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.sapient.marketdata.service.entity.MetalsEntity;
import com.sapient.marketdata.service.model.MetalsModel;

@Component
public class MetalsMapper implements Function<MetalsEntity, MetalsModel>  {

	@Override
	public MetalsModel apply(MetalsEntity entity) {
		if (Objects.isNull(entity))
			return null;
		return new MetalsModel(entity.getId(), entity.getName(), entity.getUpdatedDate());
	}
	
	public List<MetalsModel> apply(List<MetalsEntity> list) {
		if (CollectionUtils.isEmpty(list))
			return Collections.emptyList();

		return list.stream().map(entity -> new MetalsModel(entity.getId(), entity.getName(), entity.getUpdatedDate()))
				.collect(Collectors.toList());
	}
}
