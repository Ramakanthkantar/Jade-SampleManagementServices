package com.kantar.samplemanagement.samplemanagementservices.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "idt_surveys")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "DATE_CREATED")
	private Date date_created;
	@Column(name = "DATE_MODIFIED")
	private Date date_modified;
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "COMMENTS")
	private String comments;
	@Column(name = "SUBJECT")
	private String subject;
	@Column(name = "PNL_ID")
	private Long pnl_id;
	@Column(name = "CLI_ID")
	private Long cli_id;
	@Column(name = "JOB_NUMBER")
	private String job_number;
	@Column(name = "TEMPLATE_FLAG")
	private String template_flag;
	@Column(name = "RESP_PM_ID")
	private Long resp_pm_id;
	// @Column(name = "RESP_PM_ID")
	// private Integer resp_pm_id;
	@Column(name = "END_DATE_ALERT")
	private String end_date_alert;
	@Column(name = "EOM_FLAG")
	private String eom_flag;
	@Column(name = "EOM_LOI")
	private Integer eom_loi;

	@OneToMany(targetEntity = Sample.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)

	@JoinColumn(name = "sm_fk", referencedColumnName = "id")
	@JsonManagedReference
	private Collection<Sample> samples = new ArrayList<>();
	
	
}
