package com.kantar.samplemanagement.samplemanagementservices.model;

//import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.beans.JavaBean;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "msp_sample_jobs")
@JavaBean
@Entity
@ToString
public class Sample implements Serializable {

	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_IDT_SVY")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "SVY_ID", insertable = false, updatable = false)
	private Long svy_id;
	@Column(name = "NAME", insertable = false, updatable = false)
	private String sampleName;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "JOB_TYPE")
	private String jobType;
	@Column(name = "PRIORITY")
	private Long queuePriority;

	@ManyToOne(targetEntity = Survey.class, fetch = FetchType.EAGER)

	@JoinColumn(name = "svy_id", nullable = false)
	@JsonBackReference
	private Survey study;

	@ManyToOne()
	@JoinColumn(name = "stc_id", referencedColumnName = "id")
	private SampleStatus sampleStatus;

}
