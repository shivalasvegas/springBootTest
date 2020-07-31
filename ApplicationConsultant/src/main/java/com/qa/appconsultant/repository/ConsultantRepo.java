package com.qa.appconsultant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.appconsultant.model.Consultant;

@Repository
public interface ConsultantRepo extends JpaRepository<Consultant, Integer>{

	public List<Consultant> findByTechnology();
	public List<Consultant> findByClient();
	public List<Consultant> findByConsultant();
	
	public List<Consultant> findByMarkGreaterThan(int mark);
	public List<Consultant> findByMarkGreaterThanOrEqual(int mark);
	@Query(value="SELECT max(salary) FROM consulant", nativeQuery=true)
	public int maxSalary();
	
	@Query(value="SELECT max(salary) FROM consulant WHERE client=?1", nativeQuery=true)
	public int maxSalaryClient(String client);
	
	@Query(value="SELECT count(*) FROM consulant WHERE client=?1 AND tech=?!", nativeQuery=true)
	public int numberTechConsultants(String client, String tech);
	
	@Query(value="SELECT DISTINCT  client FROM consulant", nativeQuery=true)
	public List<String> clients();
}
