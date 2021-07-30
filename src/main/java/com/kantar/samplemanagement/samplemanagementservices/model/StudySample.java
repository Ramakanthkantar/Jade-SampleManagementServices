package com.kantar.samplemanagement.samplemanagementservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudySample {

	private Long id;
	private Long svyId;
	private String sampleName;
	private String sampleDescription;
	private String jobType;
	private Long queuePriority;
	private String study;
	private String sampleStatus;

}
