package com.kantar.samplemanagement.samplemanagementservices.service;

import com.kantar.samplemanagement.samplemanagementservices.model.Sample;
import com.kantar.samplemanagement.samplemanagementservices.model.StudySample;
import com.kantar.samplemanagement.samplemanagementservices.repositories.SampleRepository;
import com.kantar.samplemanagement.samplemanagementservices.services.SampleService;
import com.kantar.samplemanagement.samplemanagementservices.services.SampleServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleServiceTest {
	
	@InjectMocks
	SampleServiceImpl sampleServ;
	
	@Mock
	SampleRepository sampleRepo;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testFindSample() { 
		
		
		
		Sample sample=new Sample();
		List<Sample> sampleValues=new ArrayList<>();
		sample.setId(1234L);
		sample.setSampleName("DEVCME-130");
		sample.setDescription("sampleDescription");
		sample.setJobType("jobType");
		sample.setQueuePriority(234L);
		
		sampleValues.add(sample);
		//studySample.setStudy("test1");
		
		for(Sample sampleList:sampleValues) {
			StudySample studySample=new StudySample();
			
			studySample.setJobType(sampleList.getJobType());
			studySample.setStudy("F TEST 1");
			studySample.setSampleName(sampleList.getSampleName());
			studySample.setStudy("test1");
			
			System.out.println("sampleName"+sampleList.getSampleName());
			
			when(sampleRepo.findBySampleNameOrJobType(anyString(), anyString())).thenReturn(sampleValues);
			
			
			
			 studySample=sampleServ.findBySamples("DEVCME-130", "jobType");
			
			assertEquals("DEVCME-130", sampleList.getSampleName());
			//assertEquals();
			
			
		}
		
		
		
		
		
	}
	

}
