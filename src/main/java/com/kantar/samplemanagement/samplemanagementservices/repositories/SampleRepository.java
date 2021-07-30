package com.kantar.samplemanagement.samplemanagementservices.repositories;

import java.util.List;

import com.kantar.samplemanagement.samplemanagementservices.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import com.kantar.chinapannel.chinapannelmanagement.model.Sample;


@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
	
	
	List<Sample> findBySampleNameOrJobType(String name, String jobType);

}
