package com.kantar.samplemanagement.samplemanagementservices.controllers;

import java.util.List;

import com.kantar.samplemanagement.samplemanagementservices.model.StudySample;
import com.kantar.samplemanagement.samplemanagementservices.services.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/Jade-SampleServices")
public class SampleController {
	

	@Autowired
	SampleService sampleService;

	@Validated
	@GetMapping("/sample")
	public ResponseEntity<StudySample> findBySampleName(@RequestParam(name="name") String sampleName, @RequestParam String jobType){
		 final Logger logger = LoggerFactory.getLogger(SampleController.class);
		 
		 
		 StudySample studySamples=sampleService.findBySamples(sampleName,jobType);
		 
		 logger.debug("incontroler",studySamples.getStudy());
		
		return new ResponseEntity<StudySample>(studySamples, HttpStatus.OK);
	}
	}


