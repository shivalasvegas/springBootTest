package com.qa.appconsultant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.appconsultant.model.Consultant;

@Repository
public interface ConsultantRepo extends JpaRepository<Consultant, Integer>{


	// built in queries
	public List<Consultant> findByMarksGreaterThan(int mark);
	public List<Consultant> findByMarksGreaterThanEqual(int mark);
	
	// written queries
	@Query(value="SELECT DISTINCT client FROM consultant", nativeQuery=true)
	public List<String> clients();

	@Query(value="SELECT DISTINCT technology FROM consultant", nativeQuery=true)
	public List<String> technologies();

	@Query(value="SELECT consultant_name FROM consultant", nativeQuery=true)
	public List<String> consultants();

	@Query(value="SELECT max(salary) FROM consultant", nativeQuery=true)
	public int maxSalary();
	
	@Query(value="SELECT max(salary) FROM consultant WHERE client=?1", nativeQuery=true)
	public int maxSalaryClient(String client);
	
	@Query(value="SELECT count(*) FROM consultant WHERE client=?1 AND technology=?2", nativeQuery=true)
	public int numberTechConsultants(String client, String technology);
	
	
}
