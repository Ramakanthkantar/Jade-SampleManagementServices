package com.kantar.samplemanagement.samplemanagementservices.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="idt_status_codes")
public class SampleStatus implements Serializable{
   
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name",insertable = false,updatable = false)
    private String name;
    @Column(name="Description")
    private String description;
   
}
