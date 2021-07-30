package com.kantar.samplemanagement.samplemanagementservices.services;

//import com.kantar.chinapannel.chinapannelmanagement.model.StudySample;

import com.kantar.samplemanagement.samplemanagementservices.model.StudySample;

public interface SampleService {
	
	 StudySample findBySamples(String name, String jobType);

}
