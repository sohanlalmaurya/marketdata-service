package com.sapient.marketdata.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.marketdata.service.entity.MetalsEntity;

@Repository
public interface MetalsRepository extends JpaRepository<MetalsEntity, Integer>{

}
