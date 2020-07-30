package com.qa.applicationdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.applicationdemo.entity.Sale;

@Repository
public interface SalesRepo extends JpaRepository<Sale, Integer>{

	
	
}
